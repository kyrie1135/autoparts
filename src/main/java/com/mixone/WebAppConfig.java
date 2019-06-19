package com.mixone;

import com.mixone.portal.admin.login.interceptor.LoginInterceptor;
import com.mixone.portal.admin.util.JsonObjectArgResolverHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class WebAppConfig implements WebMvcConfigurer{

    //提前创建LoginInterceptor对象,以便可以在过滤器中注入其他对象
    @Bean
    public HandlerInterceptor getLoginInterceptor(){
        return new LoginInterceptor();
    }

    //授权拦截的路径
    // addPathPatterns：拦截的路径
    // excludePathPatterns：不拦截的路径
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(getLoginInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns("/index.html","/","/login","/static/**","css/**");
    }

    //配置静态资源路径,默认是/resources/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").
                addResourceLocations("/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

    //1 配置同时支持多个视图解析器:通过setViewNames设置的前缀判断使用哪一个视图解释器
    //1.1 thymeleaf
    //1.1.1 配置thymeleaf视图解析器
    @Bean
    public ThymeleafViewResolver thymeleafViewResolver(){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);
        //视图解析器设置编码utf-8
        viewResolver.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        viewResolver.setViewNames(new String[] {"/html/*"});//controller中视图名称需要以/thymeleaf/开头
        return viewResolver;
    }
    //1.1.2 配置thymeleaf模板解析器
    @Bean
    public SpringResourceTemplateResolver templateResolver(){
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/");
        templateResolver.setSuffix(".html");
        //设置模板类型,默认值是HTML.
        templateResolver.setTemplateMode(TemplateMode.HTML);
        //模板解析器设置编码utf-8
        templateResolver.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        //设置是否使用缓存
        templateResolver.setCacheable(false);
        return templateResolver;
    }
    //1.1.3 配置thymeleaf模板引擎
    @Bean
    public SpringTemplateEngine templateEngine(){
        // SpringTemplateEngine automatically applies SpringStandardDialect and
        // enables Spring's own MessageSource message resolution mechanisms.
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        // 配置使用SpringEL表达式
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    //1.2 freemarker
    //1.2.1 配置freemarker视图解释器
    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver(){
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setOrder(2);
        //配置了setTemplateLoaderPath,这里不需要在配置setPrefix
        freeMarkerViewResolver.setPrefix("");
        freeMarkerViewResolver.setSuffix(".ftl");
        //controller中视图名称需要以/ftl/开头
        freeMarkerViewResolver.setViewNames(new String[] {"/ftl/*"});
        //显示中文:必需与<meta charset="UTF-8">一致
        freeMarkerViewResolver.setContentType("text/html;charset=UTF-8");
        freeMarkerViewResolver.setCache(false);
        return freeMarkerViewResolver;
    }
    //1.2.2 配置freemarker configer
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        //模板页面位置.
        //因为freemarker本身配置了templateLoaderPath而在viewResolver中不需要配置prefix，
        //且路径前缀必须配置在templateLoaderPath中

        //如果配置了多个视图解释器,需要用视图名称来判断使用哪一个解释器,因此在controller直接使用了ftl,这里不需要配成/ftl
        configurer.setTemplateLoaderPath("/WEB-INF/");
        configurer.setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
        return configurer;
    }

    //1.3 配置JSP视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setOrder(3);
        //配置放置jsp文件夹
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        //通过setViewNames识别为jsp页面引擎, controller中视图名称需要以/jsp/开头
        viewResolver.setViewNames("/jsp/*");
        return viewResolver;
    }

    //重写父类提供的js跨域请求处理的接口:ajax访问Controller的REST接口用到
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //添加映射路径
        registry.addMapping("/**")
                //放行哪些原始域
                .allowedOrigins("*")
                //是否发送Cookie信息
                .allowCredentials(true)
                //放行哪些原始域(请求方式)
                .allowedMethods(HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.OPTIONS.name())
                //放行哪些原始域(头部信息)
                .allowedHeaders(HttpHeaders.AUTHORIZATION, HttpHeaders.CONTENT_TYPE, "accessToken", "CorrelationId", "source")
                //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
                .exposedHeaders(HttpHeaders.AUTHORIZATION, HttpHeaders.CONTENT_TYPE, "accessToken", "CorrelationId", "source")
                .maxAge(4800);
    }


    //注册自定义参数处理器(可处理一次传递多个json对象到controller)
    //使用方法
    //    @RequestMapping(value = "/custom")
    //    public String custom(@JsonObject User user, @JsonObject Info info){
    //        System.out.println(user.toString());
    //        System.out.println(info.toString());
    //
    //        return "success";
    //    }
    //  其他方法:使用Map对象接收
    //    @RequestMapping(value = "/show")
    //    public String test(@RequestBody  Map<String,Object> map){
    //
    //        // 拿到Object之后 再做转换为实体即可 可以用FastJson
    //        Object ukser = map.get("user");
    //        Object info = map.get("info");
    //
    //        return "success";
    //    }
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        // 配置自定义接收参数
        WebMvcConfigurer.super.addArgumentResolvers(resolvers);
        resolvers.add(new JsonObjectArgResolverHandler());
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new ByteArrayHttpMessageConverter());
//        converters.add(new StringHttpMessageConverter());
//        converters.add(new ResourceHttpMessageConverter());
//        converters.add(new AllEncompassingFormHttpMessageConverter());
//        converters.add(new StringHttpMessageConverter());
//        converters.add(jackson2HttpMessageConverter());
//    }
//
//    /**
//     * 时间格式转换器,将Date类型统一转换为yyyy-MM-dd HH:mm:ss格式的字符串
//     */
//    @Bean
//    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper mapper = new ObjectMapper();
//
//        //日期格式转换
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//
//        //Long类型转String类型
//        SimpleModule simpleModule = new SimpleModule();
//        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
//        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
//        mapper.registerModule(simpleModule);
//
//        converter.setObjectMapper(mapper);
//        return converter;
//    }
}
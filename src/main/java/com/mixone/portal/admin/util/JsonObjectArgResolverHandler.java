package com.mixone.portal.admin.util;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.reflect.Field;

//处理一个json里面有多个对象的消息
public class JsonObjectArgResolverHandler implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(JsonObject.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter,
                                  ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {

        // 获取Controller中的参数名
        String name = methodParameter.getParameterName();
        // 获取Controller中参数的类型
        Class clazz = methodParameter.getParameterType();
        Object arg = null;
        // 获取该参数实体的所用属性
        Field[] fields = clazz.getDeclaredFields();
        // 实例化
        Object target = clazz.newInstance();

        // 创建WebDataBinder对象 反射 遍历fields给属性赋值
        WebDataBinder binder = webDataBinderFactory.createBinder(nativeWebRequest,null,name);
        for (Field field:fields){
            field.setAccessible(true);
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
            // 在request中 多对象json数据的key被解析为 user[id] user[realName] info[address] 的这种形式
            String value = nativeWebRequest.getParameter(name + "[" + fieldName + "]");
            arg = binder.convertIfNecessary(value,fieldType,methodParameter);
            field.set(target,arg);
        }

        return target;
    }
}
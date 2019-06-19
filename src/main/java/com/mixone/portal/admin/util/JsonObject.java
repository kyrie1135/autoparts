package com.mixone.portal.admin.util;

import java.lang.annotation.*;

//处理一个json里面有多个对象的消息
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonObject {
}

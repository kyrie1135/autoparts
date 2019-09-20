package com.mixone.portal.admin.util;

import com.google.gson.Gson;

import java.util.Map;

public class JsonXMLUtils {

    public static String obj2json(Object obj) throws Exception {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    public static <T> T json2obj(String jsonStr, Class<T> clazz) throws Exception {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, clazz);
    }

    public static <T> Map<String, Object> json2map(String jsonStr)     throws Exception {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, Map.class);
    }
//
//    public static <T> T map2obj(Map<?, ?> map, Class<T> clazz) throws Exception {
//        Gson gson = new Gson();
//        return gson.toJson(JSON.toJSONString(map), clazz);
//    }
}

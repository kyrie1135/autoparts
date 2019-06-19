package com.mixone.portal.admin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonUtil {

    private static ObjectMapper objectMapper;


    public static String map2json(Map map){

        if(null != objectMapper){
            objectMapper = new ObjectMapper();
        }

        String jsonStr = "";
        try {
            jsonStr=objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }





}

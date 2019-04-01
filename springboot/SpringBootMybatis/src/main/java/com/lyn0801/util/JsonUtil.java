package com.lyn0801.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonUtil {
    private final static ObjectMapper objectMapper = new ObjectMapper();
    /**
     * 将对象序列化
     * @param obj
     * @return
     */
    public static String objectToJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {

        }
        return null;
    }
    /**
     * 将json string反序列化成对象
     *
     * @param json
     * @param valueType
     * @return
     */
    public static <T> T jsonToObject(String json, Class<T> valueType ) {
        try {
            T t =  objectMapper.readValue(json, valueType);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("jsonToObject failed");
        }
        return null;
    }

    /**
     * 将json array反序列化为对象
     *
     * @param json
     * @param valueType
     * @return
     */
    public static <T>List<T> jsonToListObject(String json, Class<T> valueType) {
        JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class,valueType);
        try {
            List<T> list = objectMapper.readValue(json, javaType);
            return list;
        } catch (Exception e) {

        }
        return null;
    }
}

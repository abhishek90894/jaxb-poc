package com.spring.jaxb.jaxb.javaTojson;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.util.Map;

public class jsonUtil
{
private static ObjectMapper mapper;
static
{
    mapper = new ObjectMapper();
}

public static String convertJavaToJson(Object object) throws Exception
{
    String jsonResponse ="";
   jsonResponse = mapper.writeValueAsString(object);
  return jsonResponse;

}

public static <T> T convertJsonToJava(String jsonString ,Class<T> cls) throws Exception
{
     T result = null;
     result = mapper.readValue(jsonString,cls);
     return result;
}











}

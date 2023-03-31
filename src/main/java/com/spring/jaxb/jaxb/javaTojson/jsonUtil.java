package com.spring.jaxb.jaxb.javaTojson;

import org.codehaus.jackson.map.ObjectMapper;

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
}

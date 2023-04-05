package com.spring.jaxb.jaxb.jsonTojava;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;

public class jsontojava {

    public static void main(String[] args) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

          File file = new File("file.json");
         info info    = mapper.readValue(file, info.class);
        System.out.println(info);
    }
}

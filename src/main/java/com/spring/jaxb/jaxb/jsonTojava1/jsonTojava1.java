package com.spring.jaxb.jaxb.jsonTojava1;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;

@Slf4j
public class jsonTojava1 {

    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        File file1 = new File("file1.json");
       // info info    = mapper.readValue(file1,info.class);
        info info1 = mapper.readValue(file1,info.class);
        log.info("info {}",info1);


    }
}

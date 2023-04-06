package com.spring.jaxb.jaxb.soapTojava;

import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class AppConfig {

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {

        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        //jaxb2Marshaller.setPackagesToScan("com.spring.jaxb.jaxb.soapTojava");

        Map<String, Object> props = new HashMap<String, Object>();
        props.put("jaxb.formatted.output", false);
        jaxb2Marshaller.setMarshallerProperties(props);
        return jaxb2Marshaller;
    }
}

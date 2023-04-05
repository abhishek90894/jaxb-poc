package com.spring.jaxb.jaxb.xmlTojava4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class xmltojava {

    public static void main(String[] args) throws Exception {


        File file=new File("promountfinancialresponse.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(promuntFinancialResponse.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        promuntFinancialResponse promountfinancialResponse = (promuntFinancialResponse) jaxbUnmarshaller.unmarshal(file);

        System.out.println(promountfinancialResponse);


    }
    }


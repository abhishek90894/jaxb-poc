package com.spring.jaxb.jaxb.soapTojava3;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Slf4j
public class main {
    public static void main(String[] args) {

        try {

        File file = new File("response.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        Response response = (Response) jaxbUnmarshaller.unmarshal(file);
          log.info("{}",response);

    } catch (
    JAXBException e) {
        e.printStackTrace();
    }

}
}

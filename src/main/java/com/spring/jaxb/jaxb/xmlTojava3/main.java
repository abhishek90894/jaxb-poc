package com.spring.jaxb.jaxb.xmlTojava3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class main {

    public static void main(String[] args) throws Exception {

        student student = new student();
        student.setId(1);
        student.setFirstName("abhishek");
        student.setLastName("srivastava");

       JAXBContext jaxbContext = JAXBContext.newInstance(student.class);
        /**
         * convert pojo into xml
         */
        Marshaller marshaller = jaxbContext.createMarshaller();
        File file = new File("src\\main\\java\\com\\spring\\jaxb\\jaxb\\xmlTojava3\\student.xml");

        marshaller.marshal(student,file);
       
    }
}

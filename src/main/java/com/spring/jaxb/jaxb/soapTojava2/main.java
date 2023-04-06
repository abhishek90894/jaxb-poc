package com.spring.jaxb.jaxb.soapTojava2;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Slf4j
public class main {

    public static void main(String[] args) {
        try {
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("input.xml"));
            xsr.nextTag(); // Advance to Envelope tag

            xsr.nextTag(); // Advance to Body tag
            xsr.nextTag();
            xsr.nextTag();


            JAXBContext jc = JAXBContext.newInstance(LoginResult.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<LoginResult> je = unmarshaller.unmarshal(xsr, LoginResult.class);

            //System.out.println(je.getName());
            log.info("{}",je.getValue());
            log.info("{}",je.getName());
            log.info("{}",je.getValue().getErrorMessage());
           // System.out.println(je.getValue());
           // System.out.println(je.getValue().getErrorMessage());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    }


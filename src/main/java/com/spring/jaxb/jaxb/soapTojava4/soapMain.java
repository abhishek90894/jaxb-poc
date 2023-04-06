package com.spring.jaxb.jaxb.soapTojava4;

import com.spring.jaxb.jaxb.soapTojava3.Response;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Slf4j
public class soapMain {

    public static void main(String[] args) throws Exception {
//        try {
//
//            File file = new File("soap.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(SendToWallet.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//
//            SendToWallet sendToWallet = (SendToWallet) jaxbUnmarshaller.unmarshal(file);
//            log.info("{}", sendToWallet);
//
//        } catch (
//                JAXBException e) {
//            e.printStackTrace();
////        }
////
////    }

        try {
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("soap.xml"));
            xsr.nextTag(); // Advance to Envelope tag

            xsr.nextTag(); // Advance to Body tag
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();



            JAXBContext jc = JAXBContext.newInstance(SendToWallet.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<SendToWallet> je = unmarshaller.unmarshal(xsr, SendToWallet.class);

            System.out.println(je.getName());
            System.out.println(je.getValue());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }
    }


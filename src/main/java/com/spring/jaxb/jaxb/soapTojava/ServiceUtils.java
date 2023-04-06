package com.spring.jaxb.jaxb.soapTojava;

import java.io.IOException;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

@Component
public class ServiceUtils {

    @Autowired
    Jaxb2Marshaller jaxb2Marshaller;

    @SuppressWarnings("unchecked")
    public <T> T unmarshall(SOAPMessage soapMessage, Class<T> type)
            throws XmlMappingException, IOException, SOAPException {

        T jaxbElement = (T) jaxb2Marshaller.unmarshal(
                new DOMSource(soapMessage.getSOAPBody().extractContentAsDocument()));
        return jaxbElement;
    }
}

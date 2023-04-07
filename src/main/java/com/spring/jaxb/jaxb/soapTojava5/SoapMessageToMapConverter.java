package com.spring.jaxb.jaxb.soapTojava5;

import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class SoapMessageToMapConverter {




//    public static Map<String, Object> soapMessageToMap(String soapMessage) throws Exception {
//        Map<String, Object> map = new LinkedHashMap<>();
//
//        // Parse the SOAP message into a Document object
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setNamespaceAware(true);
//        Document doc = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(soapMessage)));
//
//        // Extract the CDATA content from the strReq element
//        String cdataContent = doc.getElementsByTagName("tem:strReq").item(0).getTextContent();
//
//        // Parse the CDATA content into a JAXB object
//        JAXBContext jaxbContext = JAXBContext.newInstance(MobiPay.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        MobiPay mobiPay = (MobiPay) unmarshaller.unmarshal(new StringReader(cdataContent));
//
//        // Convert the JAXB object into a Map object
//        Map<String, Object> mobiPayMap = new LinkedHashMap<>();
//        mobiPayMap.put("ver", mobiPay.getVer());
//        mobiPayMap.put("InstitutionID", mobiPay.getInstitutionID());
//        mobiPayMap.put("UserName", mobiPay.getUserName());
//        mobiPayMap.put("Password", mobiPay.getPassword());
//
//        Map<String, Object> sendToWalletRequestMap = new LinkedHashMap<>();
//        sendToWalletRequestMap.put("TransType", mobiPay.getSendToWalletRequest().getTransType());
//        sendToWalletRequestMap.put("Amount", mobiPay.getSendToWalletRequest().getAmount());
//        sendToWalletRequestMap.put("Description", mobiPay.getSendToWalletRequest().getDescription());
//        sendToWalletRequestMap.put("Recipient", mobiPay.getSendToWalletRequest().getRecipient());
//        sendToWalletRequestMap.put("SMSText", mobiPay.getSendToWalletRequest().getSMSText());
//        sendToWalletRequestMap.put("ReqTraceID", mobiPay.getSendToWalletRequest().getReqTraceID());
//        sendToWalletRequestMap.put("DateTime", mobiPay.getSendToWalletRequest().getDateTime());
//
//        mobiPayMap.put("SendToWalletRequest", sendToWalletRequestMap);
//
//        map.put("MobiPay", mobiPayMap);
//        return map;
//
//         soapMessage = "..."; // Your SOAP message here
//         map = SoapMessageToMapConverter.soapMessageToMap(soapMessage);
//        System.out.println(map);
//    }

}

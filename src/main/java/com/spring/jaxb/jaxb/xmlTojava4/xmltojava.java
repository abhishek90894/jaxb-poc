package com.spring.jaxb.jaxb.xmlTojava4;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Slf4j
public class xmltojava {

    public static void main(String[] args) throws Exception {


        File file=new File("promountfinancialresponse.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(promuntFinancialResponse.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        promuntFinancialResponse promountfinancialResponse = (promuntFinancialResponse) jaxbUnmarshaller.unmarshal(file);

        //System.out.println(promountfinancialResponse);

        String s ="<promuntFinancialResponse>\n" +
                "    <function>updatepreceipts</function>\n" +
                "    <receiptDate>20210921</receiptDate>\n" +
                "    <cashierNo>505</cashierNo>\n" +
                "    <reference>136183273</reference>\n" +
                "\n" +
                "\n" +
                "    <date>20210921</date>\n" +
                "    <mcno>505</mcno>\n" +
                "    <operator>B5</operator>\n" +
                "    <recno>16200</recno>\n" +
                "    <icode>zz</icode>\n" +
                "    <paytype>C</paytype>\n" +
                "    <account>1115000536</account>\n" +
                "    <ref>136183273</ref>\n" +
                "    <amount>380000</amount>\n" +
                "</promuntFinancialResponse>";


        log.info("input xml {}",s);
        log.info(" output java object{}",promountfinancialResponse);

    }
    }


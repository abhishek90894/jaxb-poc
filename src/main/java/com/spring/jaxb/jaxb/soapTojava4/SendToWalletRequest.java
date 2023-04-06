package com.spring.jaxb.jaxb.soapTojava4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class SendToWalletRequest {

    @XmlElement
    private String TransType;
    @XmlElement
    private String Amount;
    @XmlElement
    private  String Description;
    @XmlElement
    private String Recipient;
    @XmlElement
    private String SMSText;
    @XmlElement
    private String ReqTraceID;
    @XmlElement
    private String DateTime;
}

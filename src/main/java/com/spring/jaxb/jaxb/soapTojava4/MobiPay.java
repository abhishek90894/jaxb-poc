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
public class MobiPay {
    @XmlElement
    private String ver;
    @XmlElement
    private String InstitutionID;
    @XmlElement
    private String UserName;
    @XmlElement
    private String Password;
    @XmlElement
    private SendToWalletRequest sendToWalletRequest;
}

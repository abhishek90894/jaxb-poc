package com.spring.jaxb.jaxb.soapTojava3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "value",
        "code",
        "Name",
})
public class DashboardDTO {

    @XmlElement(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
    private double value;

    @XmlElement(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
    private String code;

    @XmlElement(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/PS.SharedWebServices.Response")
    private String Name;
}

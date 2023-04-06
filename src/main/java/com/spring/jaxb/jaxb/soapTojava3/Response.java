package com.spring.jaxb.jaxb.soapTojava3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Response", namespace = "http://tempuri.org/")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {
    @XmlElement(name="Result", namespace = "http://tempuri.org/")
    private Result result;
}

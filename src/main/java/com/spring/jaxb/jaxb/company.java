package com.spring.jaxb.jaxb;

import javax.xml.bind.annotation.XmlValue;

public class company {


    private String name;


    @XmlValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

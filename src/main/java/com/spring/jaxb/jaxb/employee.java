package com.spring.jaxb.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee {

    private String name;
    private Integer age;

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

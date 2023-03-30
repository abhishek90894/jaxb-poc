package com.spring.jaxb.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee {

    private String name;
    private Integer age;

    private Integer id;

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public Integer getAge() {
        return age;
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;


    }
}

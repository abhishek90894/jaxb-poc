package com.spring.jaxb.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee {

    private String name;
    private Integer age;

    private Integer id;
    private  company company;

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public Integer getAge() {
        return age;
    }
    @XmlElement
    public company getCompany() {
        return company;
    }

    public void setCompany(company company) {
        this.company = company;
    }

    @XmlAttribute            // xml employee id   for this we use this annotation
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

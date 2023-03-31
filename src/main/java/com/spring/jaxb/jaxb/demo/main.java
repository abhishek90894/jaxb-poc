package com.spring.jaxb.jaxb.demo;

import com.spring.jaxb.jaxb.jaxb.EmployeeJaxb;

import javax.xml.bind.JAXBException;

public class main {

    public static void main(String[] args) throws JAXBException

    {

        EmployeeJaxb employeeJaxb = new EmployeeJaxb();
         employeeJaxb.marshall();
         employeeJaxb.unmarshall();
    }
}

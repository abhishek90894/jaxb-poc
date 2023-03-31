package com.spring.jaxb.jaxb.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import java.io.File;

public class EmployeeJaxb {

    public void marshall() throws JAXBException
    {
        /**
         *  convert pojo into xml
         */
        Employee emp = new Employee();
            emp.setId(101);
            emp.setName("abhishek srivastava");
            emp.setAddress("kanpur uttar pradesh");
            emp.setSalary(50000);

        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
         marshaller.marshal((Employee) emp,System.out);
          marshaller.marshal(emp,new File("src\\main\\java\\com\\spring\\jaxb\\jaxb\\data\\Employee.xml"));

    }

    public void unmarshall() throws JAXBException
    {
        /**
         *  xml to pojo
         */
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Employee emp = (Employee)unmarshaller.unmarshal(new File("src\\main\\java\\com\\spring\\jaxb\\jaxb\\data\\Employee.xml"));
        System.out.println(emp.getId()+"\n"+ emp.getSalary()+"\n"+emp.getAddress()+"\n"+emp.getName());


    }
}

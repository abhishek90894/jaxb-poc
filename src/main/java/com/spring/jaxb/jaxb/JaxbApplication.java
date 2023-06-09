package com.spring.jaxb.jaxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@SpringBootApplication
public class JaxbApplication {

	public static void main(String[] args) throws JAXBException
	{
		SpringApplication.run(JaxbApplication.class, args);


		String xml ="<employee>"+
				"<name>abhishek</name>"+
				"<age>25</age>"+
				 "</employee>";

		// create the pojo class employee

		// creating jaxbcontext object
		JAXBContext jaxbContext = JAXBContext.newInstance(employee.class);

		// create unmarshller object

		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		employee pojo  =  (employee) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(pojo.getAge());
		System.out.println(pojo.getName());
	}

}

package com.spring.jaxb.jaxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

@SpringBootApplication
public class JaxbApplication {

	public static void main(String[] args) throws JAXBException
	{
		SpringApplication.run(JaxbApplication.class, args);


		String xml ="<employee id =\"1234\">"+
				"<name>abhishek</name>"+
				"<age>25</age>"+
				"<company id = \"company_id\">company name</company>"+
				 "</employee>";

		// create the pojo class employee

		// creating jaxbcontext object
		JAXBContext jaxbContext = JAXBContext.newInstance(employee.class);

		// create unmarshller object

		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		employee pojo  =  (employee) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(pojo);
		System.out.println(pojo.getCompany().getName());

		/**
		 * converting pojo to xml
		 */
		// create marshaller object

		Marshaller marshaller = jaxbContext.createMarshaller();
		//create the content tree by using set methods
		 pojo.setAge(28);
		 pojo.setName("ankur");

		 //call the marshall method
		StringWriter sw = new StringWriter();
		marshaller.marshal(pojo,sw);
		System.out.println(sw.toString());



		 //

	}

}

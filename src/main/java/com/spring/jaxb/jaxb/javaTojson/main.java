package com.spring.jaxb.jaxb.javaTojson;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.util.Map;

public class main {

    public static void main(String[] args)  throws Exception
    {
        Employee emp = new Employee();
        emp.setEmpId(102);
        emp.setEmpName("abhishek srivastava");
        emp.setSalary(60000D);
        String jasonEmployee  = jsonUtil.convertJavaToJson(emp);
        System.out.println(jasonEmployee);

        Employee emp1  = jsonUtil.convertJsonToJava(jasonEmployee,Employee.class);
        System.out.println(emp1);

                 String jsonEmployee1 = jsonUtil.convertJavaToJson(emp1);
        System.out.println(jsonEmployee1);

        /**
         * convert json file to map object
         */

        File file = new File("file.json");
        //  read JSON data from file using fileObj and map it using ObjectMapper and TypeReference

       ObjectMapper mapper = new ObjectMapper();


        // read JSON data from file using fileObj and map it using ObjectMapper and TypeReference classes
        Map<String, Object> userData = mapper.readValue(file, new TypeReference<Map<String, Object>>() {
        });

          userData.forEach((k,v)->{
              System.out.println(k+""+v);
          });





    }
}

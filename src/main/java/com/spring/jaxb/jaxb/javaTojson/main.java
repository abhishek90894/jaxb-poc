package com.spring.jaxb.jaxb.javaTojson;

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


    }
}

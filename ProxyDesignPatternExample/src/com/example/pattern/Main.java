package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        Document adminDocument =
            new DocumentProxy("EmployeeData.pdf", "ADMIN");

        Document employeeDocument =
            new DocumentProxy("EmployeeData.pdf", "EMPLOYEE");

        adminDocument.display();

        System.out.println("----------------");

        employeeDocument.display();
    }
}

package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        Developer dev1 =
            new Developer("Rahul", "Java Developer");

        Developer dev2 =
            new Developer("Amit", "Frontend Developer");

        Developer dev3 =
            new Developer("Priya", "Backend Developer");

        Manager teamLead = new Manager("John");

        teamLead.addEmployee(dev1);
        teamLead.addEmployee(dev2);

        Manager projectManager = new Manager("David");

        projectManager.addEmployee(teamLead);
        projectManager.addEmployee(dev3);

        projectManager.showDetails();
    }
}

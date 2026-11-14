package com.example.pattern;

class Employee implements Cloneable {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public Employee clone() {

        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    void display() {
        System.out.println(id + " " + name + " " + department);
    }
}
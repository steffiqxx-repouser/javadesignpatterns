package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        Employee original =
                new Employee(101, "John", "IT");

        Employee copy = original.clone();

        copy.id = 102;
        copy.name = "David";

        original.display();
        copy.display();
    }
}

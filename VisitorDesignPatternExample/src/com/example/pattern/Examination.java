package com.example.pattern;


abstract class Examination {

    public final void conduct() {
        registerStudents();
        conductExam();
        evaluate();
        publishResults();
    }

    private void registerStudents() {
        System.out.println("Students registered");
    }

    abstract void conductExam();

    abstract void evaluate();

    private void publishResults() {
        System.out.println("Results published");
    }
}





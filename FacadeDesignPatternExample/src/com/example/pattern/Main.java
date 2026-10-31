package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade();

        // Start movie
        homeTheater.watchMovie("Avengers last part");

        System.out.println("----------------");

        // Stop movie
        homeTheater.stopMovie();
    }
}
package com.example.pattern;

public class HomeTheaterFacade {

    private Television television;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        television = new Television();
        dvdPlayer = new DVDPlayer();
        soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie) {

        System.out.println("Preparing home theater...");

        television.turnOn();
        television.setInput("DVD");

        dvdPlayer.turnOn();

        soundSystem.turnOn();
        soundSystem.setVolume(10);

        dvdPlayer.playMovie(movie);
    }

    public void stopMovie() {

        System.out.println("Shutting down home theater...");

        dvdPlayer.turnOff();
        soundSystem.turnOff();
        television.turnOff();
    }
}

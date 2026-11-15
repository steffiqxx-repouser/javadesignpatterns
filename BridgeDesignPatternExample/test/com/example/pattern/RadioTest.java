package com.example.pattern;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RadioTest {

    private String captureOutput(Runnable action) {

        PrintStream original = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));
            action.run();
        } finally {
            System.setOut(original);
        }

        return output.toString();
    }

    @Test
    void testTurnOn() {

        Radio radio = new Radio();

        String output = captureOutput(radio::turnOn);

        assertTrue(output.contains("Radio is ON"));
    }

    @Test
    void testTurnOff() {

        Radio radio = new Radio();

        String output = captureOutput(radio::turnOff);

        assertTrue(output.contains("Radio is OFF"));
    }

    @Test
    void testVolumeUp() {

        Radio radio = new Radio();

        String output = captureOutput(() -> radio.setVolume(10));

        assertTrue(output.contains("Radio volume: 83"));
    }

    @Test
    void testVolumeDown() {

        Radio radio = new Radio();

        String output = captureOutput(() -> radio.setVolume(-10));

        assertTrue(output.contains("Radio volume: 63"));
    }

    @Test
    void testMute() {

        Radio radio = new Radio();

        String output = captureOutput(() -> radio.setVolume(0));

        assertTrue(output.contains("Radio volume: 0"));
    }

    @Test
    void testMaximumVolume() {

        Radio radio = new Radio();

        String output = captureOutput(() -> radio.setVolume(50));

        assertTrue(output.contains("Radio volume: 100"));
    }

    @Test
    void testMinimumVolume() {

        Radio radio = new Radio();

        String output = captureOutput(() -> radio.setVolume(-100));

        assertTrue(output.contains("Radio volume: 0"));
    }
}

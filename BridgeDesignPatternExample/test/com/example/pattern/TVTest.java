package com.example.pattern;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

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

		TV tv = new TV();

		String output = captureOutput(tv::turnOn);

		assertTrue(output.contains("TV is ON"));
	}

	@Test
	void testTurnOff() {

		TV tv = new TV();

		String output = captureOutput(tv::turnOff);

		assertTrue(output.contains("TV is OFF"));
	}

	@Test
	void testVolumeUp() {

		TV tv = new TV();

		String output = captureOutput(() -> tv.setVolume(10));

		assertTrue(output.contains("TV volume: 52"));
	}

	@Test
	void testVolumeDown() {

		TV tv = new TV();

		String output = captureOutput(() -> tv.setVolume(-10));

		assertTrue(output.contains("TV volume: 32"));
	}

	@Test
	void testMute() {

		TV tv = new TV();

		String output = captureOutput(() -> tv.setVolume(0));

		assertTrue(output.contains("TV volume: 0"));
	}

	@Test
	void testMaximumVolume() {

		TV tv = new TV();

		String output = captureOutput(() -> tv.setVolume(100));

		assertTrue(output.contains("TV volume: 100"));
	}

	@Test
	void testMinimumVolume() {

		TV tv = new TV();

		String output = captureOutput(() -> tv.setVolume(-100));

		assertTrue(output.contains("TV volume: 0"));
	}
}

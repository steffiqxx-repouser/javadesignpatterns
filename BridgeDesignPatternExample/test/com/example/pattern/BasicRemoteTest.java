package com.example.pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicRemoteTest {

    // Fake implementation of Device
    static class FakeDevice implements Device {

        boolean turnedOn = false;
        int volumeChange = 0;
        int volume = 50;

        @Override
        public void turnOn() {
            turnedOn = true;
        }

        @Override
        public void turnOff() {
            turnedOn = false;
        }

        @Override
        public void setVolume(int volume) {
            volumeChange = volume;

            if (volume == 0) {
                this.volume = 0;
            } else {
                this.volume = Math.max(
                    0, Math.min(100, this.volume + volume)
                );
            }
        }

        @Override
        public String getName() {
            return "Fake Device";
        }
    }

    @Test
    void testPowerOn() {

        FakeDevice device = new FakeDevice();

        BasicRemote remote = new BasicRemote(device);

        remote.power();

        assertTrue(device.turnedOn);
    }

    @Test
    void testVolumeUp() {

        FakeDevice device = new FakeDevice();

        BasicRemote remote = new BasicRemote(device);

        remote.volumeUp();

        assertEquals(10, device.volumeChange);
        assertEquals(60, device.volume);
    }

    @Test
    void testVolumeDown() {

        FakeDevice device = new FakeDevice();

        BasicRemote remote = new BasicRemote(device);

        remote.volumeDown();

        assertEquals(-10, device.volumeChange);
        assertEquals(40, device.volume);
    }
}


package com.example.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AdvancedRemoteTest {

    // Simple fake implementation of Device.
    static class FakeDevice implements Device {

        private boolean on = false;
        private int volume = 50;

        @Override
        public void turnOn() {
            on = true;
        }

        @Override
        public void turnOff() {
            on = false;
        }

        @Override
        public void setVolume(int volume) {
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

        public boolean isOn() {
            return on;
        }

        public int getVolume() {
            return volume;
        }
    }

    @Test
    void testMute() {

        FakeDevice device = new FakeDevice();

        AdvancedRemote remote = new AdvancedRemote(device);

        remote.mute();

        assertEquals(0, device.getVolume());
    }

    @Test
    void testPowerOn() {

        FakeDevice device = new FakeDevice();

        AdvancedRemote remote = new AdvancedRemote(device);

        remote.power();

        assertTrue(device.isOn());
    }

    @Test
    void testVolumeUp() {

        FakeDevice device = new FakeDevice();

        AdvancedRemote remote = new AdvancedRemote(device);

        remote.volumeUp();

        assertEquals(60, device.getVolume());
    }

    @Test
    void testVolumeDown() {

        FakeDevice device = new FakeDevice();

        AdvancedRemote remote = new AdvancedRemote(device);

        remote.volumeDown();

        assertEquals(40, device.getVolume());
    }
}

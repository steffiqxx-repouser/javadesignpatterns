package com.example.pattern;

public abstract class RemoteControl {
	protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Remote: toggling power for "
                + device.getName());
        device.turnOn();
    }

    public void volumeUp() {
        device.setVolume(10);
    }

    public void volumeDown() {
        device.setVolume(-10);
    }
}

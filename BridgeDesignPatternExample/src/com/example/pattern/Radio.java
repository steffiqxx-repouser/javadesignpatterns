package com.example.pattern;

public class Radio implements Device {
	 private boolean on = false;
	    private int volume = 73;

	    @Override
	    public void turnOn() {
	        on = true;
	        System.out.println("Radio is ON");
	    }

	    @Override
	    public void turnOff() {
	        on = false;
	        System.out.println("Radio is OFF");
	    }

	    @Override
	    public void setVolume(int volume) {
	        if (volume == 0) {
	            this.volume = 0;
	        } else {
	            this.volume = Math.max(
	                    0, Math.min(100, this.volume + volume));
	        }

	        System.out.println("Radio volume: " + this.volume);
	    }

	    @Override
	    public String getName() {
	        return "Radio";
	    }
}

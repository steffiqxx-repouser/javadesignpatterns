package com.example.pattern;

public class TV implements Device {

	  private boolean on = false;
	    private int volume = 42;

	    @Override
	    public void turnOn() {
	        on = true;
	        System.out.println("TV is ON");
	    }

	    @Override
	    public void turnOff() {
	        on = false;
	        System.out.println("TV is OFF");
	    }

	    @Override
	    public void setVolume(int volume) {
	        if (volume == 0) {
	            this.volume = 0;
	        } else {
	            this.volume = Math.max(
	                    0, Math.min(100, this.volume + volume));
	        }

	        System.out.println("TV volume: " + this.volume);
	    }

	    @Override
	    public String getName() {
	        return "TV";
	    }
}

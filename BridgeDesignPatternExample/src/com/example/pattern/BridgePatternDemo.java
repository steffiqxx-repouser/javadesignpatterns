package com.example.pattern;


	public class BridgePatternDemo {
	    public static void main(String[] args) {
	        Device tv = new TV();
	        Device radio = new Radio();

	        // The same remote type can operate different devices.
	        RemoteControl basicTVRemote = new BasicRemote(tv);
	        RemoteControl basicRadioRemote = new BasicRemote(radio);

	        basicTVRemote.power();
	        basicTVRemote.volumeUp();

	        System.out.println();

	        basicRadioRemote.power();
	        basicRadioRemote.volumeUp();

	        System.out.println();

	        // The advanced remote can also work with either device.
	        AdvancedRemote advancedTVRemote = new AdvancedRemote(tv);
	        advancedTVRemote.mute();
	    }

}

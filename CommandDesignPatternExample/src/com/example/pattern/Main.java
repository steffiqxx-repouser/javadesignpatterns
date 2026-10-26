package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        // Receiver
        Light livingRoomLight = new Light();

        // Concrete commands
        Command lightOn =
                new LightOnCommand(livingRoomLight);

        Command lightOff =
                new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Execute ON command
        remote.setCommand(lightOn);
        remote.pressButton();

        // Execute OFF command
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

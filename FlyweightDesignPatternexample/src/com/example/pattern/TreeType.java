package com.example.pattern;

public class TreeType {
	 private final String name;
	    private final String color;
	    private final String texture;

	    public TreeType(String name, String color, String texture) {
	        this.name = name;
	        this.color = color;
	        this.texture = texture;
	    }

	    public void draw(int x, int y, int height) {
	        System.out.println(
	            "Drawing " + name +
	            " tree | Color: " + color +
	            " | Texture: " + texture +
	            " | Position: (" + x + ", " + y + ")" +
	            " | Height: " + height
	        );
	    }
}

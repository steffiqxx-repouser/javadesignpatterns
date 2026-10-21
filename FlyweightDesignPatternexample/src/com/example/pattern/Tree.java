package com.example.pattern;

public class Tree {
	 private final int x;
	    private final int y;
	    private final int height;
	    private final TreeType type;

	    public Tree(int x, int y, int height, TreeType type) {
	        this.x = x;
	        this.y = y;
	        this.height = height;
	        this.type = type;
	    }

	    public void draw() {
	        type.draw(x, y, height);
	    }
	    public TreeType getType() {
	        return type;
	    }
}

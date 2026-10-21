package com.example.pattern;

public class FlyweightDemo {
	 public static void main(String[] args) {

	        Tree oak1 = new Tree(
	            10, 20, 15,
	            TreeFactory.getTreeType("Oak", "Green", "OakTexture")
	        );

	        Tree oak2 = new Tree(
	            30, 40, 20,
	            TreeFactory.getTreeType("Oak", "Green", "OakTexture")
	        );

	        Tree pine1 = new Tree(
	            50, 60, 25,
	            TreeFactory.getTreeType("Pine", "DarkGreen", "PineTexture")
	        );

	        Tree oak3 = new Tree(
	            70, 80, 18,
	            TreeFactory.getTreeType("Oak", "Green", "OakTexture")
	        );

	        oak1.draw();
	        oak2.draw();
	        pine1.draw();
	        oak3.draw();

	        System.out.println(
	            "\nTotal tree objects: 4"
	        );

	        System.out.println(
	            "Shared TreeType objects: " +
	            TreeFactory.getSharedTypeCount()
	        );

	        System.out.println(
	        	    "oak1 and oak2 share type: " +
	        	    (oak1.getType() == oak2.getType())
	        	);
	        }

	    // Helper methods are omitted here intentionally;
	    // see the simpler identity check below.
}

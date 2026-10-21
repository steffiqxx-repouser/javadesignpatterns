package com.example.pattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	  private static final Map<String, TreeType> treeTypes =
	            new HashMap<>();

	    public static TreeType getTreeType(
	            String name, String color, String texture) {

	        String key = name + "-" + color + "-" + texture;

	        if (!treeTypes.containsKey(key)) {
	            treeTypes.put(
	                key,
	                new TreeType(name, color, texture)
	            );
	            System.out.println("Creating shared type: " + key);
	        }

	        return treeTypes.get(key);
	    }

	    public static int getSharedTypeCount() {
	        return treeTypes.size();
	    }
}

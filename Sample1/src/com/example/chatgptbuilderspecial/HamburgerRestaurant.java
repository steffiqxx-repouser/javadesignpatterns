package com.example.chatgptbuilderspecial;

public class HamburgerRestaurant {
	 private final BuildingConstructionApi builder;

	    public HamburgerRestaurant(BuildingConstructionApi builder) {
	        this.builder = builder;
	    }

	    public Building constructHamburgerRestaurant() {
	        builder.addWalls();
	        builder.addFloors();

	        return builder.build();
	    }
}

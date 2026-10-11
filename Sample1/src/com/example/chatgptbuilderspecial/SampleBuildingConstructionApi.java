package com.example.chatgptbuilderspecial;

public class SampleBuildingConstructionApi implements BuildingConstructionApi {

	  private final Building building = new Building();

	    @Override
	    public void addWalls() {
	        building.setWalls("Bricks");
	        System.out.println("Walls constructed using bricks");
	    }

	    @Override
	    public void addFloors() {
	        building.setFloors("Concrete");
	        System.out.println("Floors constructed using concrete");
	    }

	    @Override
	    public Building build() {
	        return building;
	    }
}

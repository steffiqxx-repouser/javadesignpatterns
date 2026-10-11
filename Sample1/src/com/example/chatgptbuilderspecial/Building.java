package com.example.chatgptbuilderspecial;

public class Building {
	private String walls;
    private String floors;
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getFloors() {
		return floors;
	}
	public void setFloors(String floors) {
		this.floors = floors;
	}
	 public void showBuildingDetails() {
	        System.out.println("Walls: " + walls);
	        System.out.println("Floors: " + floors);
	    }
}

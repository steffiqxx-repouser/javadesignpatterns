package com.example.sample;

//the perks of working with spring and spring boot has its curse too :(((((((
public class SampleBuildingConstructionApi implements BuildingConstructionApi {

	@Override
	public void addWalls() {
		// TODO Auto-generated method stub
		System.out.println("walls requires bricks");

	}
	
	public void addFloors() {
		System.out.println("so does floors also requires bricks");

	}

}

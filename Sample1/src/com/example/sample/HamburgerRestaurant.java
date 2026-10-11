package com.example.sample;

public class HamburgerRestaurant extends SampleBuildingConstructionApi {

	private SampleBuildingConstructionApi api;

	public HamburgerRestaurant(SampleBuildingConstructionApi api) {
		super();
		this.api = api;
	}

	public void constructHamburgerRestaurant() {
		api.addFloors();
	}
}

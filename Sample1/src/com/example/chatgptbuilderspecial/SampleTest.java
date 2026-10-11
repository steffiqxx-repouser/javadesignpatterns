package com.example.chatgptbuilderspecial;

public class SampleTest {
	public static void main(String[] args) {
		  BuildingConstructionApi builder =
	                new SampleBuildingConstructionApi();

	        HamburgerRestaurant restaurant =
	                new HamburgerRestaurant(builder);

	        Building building =
	                restaurant.constructHamburgerRestaurant();

	        building.showBuildingDetails();
	}
}

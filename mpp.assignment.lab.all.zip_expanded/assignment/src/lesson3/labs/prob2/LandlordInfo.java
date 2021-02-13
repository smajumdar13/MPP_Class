package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	
	private List<Building> buildings;
	public LandlordInfo() {
		buildings = new ArrayList<Building>();
	}
	public void addBuilding(Building b) {
		buildings.add(b);
		
	}

	public double calcProfits() {
		double profit =0;
		
		for(var building : buildings) {
			profit+= building.getProfit();
		}
		return  profit;
	}

}

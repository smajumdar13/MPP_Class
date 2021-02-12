package Lesson3.Prob2;

import java.util.List;

public class LandlordInfo {
	private List<Building> buildings;
	
	public LandlordInfo() {
		this.buildings = buildings;
	}
	
	public LandlordInfo(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	public double totalProfit() {
		double totalProfit = 0.0;
		for(Building b: buildings) {
			totalProfit += b.sumProfit();
		}
		return totalProfit;
	}
}
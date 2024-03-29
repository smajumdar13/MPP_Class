package Lesson3.Prob2;

import java.util.List;

public class Building {
	private List<Apartment> apts;
	private double maintenance;
	
	public Building(List<Apartment> apts, double maintenance) {
		this.apts = apts;
		this.maintenance = maintenance;
	}
	
	public double sumProfit() {
		double profit = 0.0;
		for(Apartment a: apts) {
			profit += a.getRent();
		}
		double netProfit = profit - maintenance;
		return netProfit;
	}
}
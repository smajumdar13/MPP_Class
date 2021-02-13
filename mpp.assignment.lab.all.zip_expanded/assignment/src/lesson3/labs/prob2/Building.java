package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private int buildingId;
	private double maintenanceCost;
	private List<Apartment> apartments;

	public List<Apartment> getApartments() {
		return apartments;
	}

	public Building(int buildingId, int maintenanceCost) {

		this.buildingId = buildingId;
		this.maintenanceCost = maintenanceCost;
		apartments = new ArrayList<Apartment>();
	}

	public void addApartment(Apartment a) {
		apartments.add(a);
	}	

	public int getBuildingId() {
		return buildingId;
	}
	public double getProfit() {
		double rent = 0;
		for(var apart: apartments) {
			rent+= apart.getRent();
		}
		return rent - maintenanceCost;
	}

}

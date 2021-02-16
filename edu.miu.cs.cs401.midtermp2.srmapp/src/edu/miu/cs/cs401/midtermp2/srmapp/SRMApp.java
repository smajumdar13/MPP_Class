package edu.miu.cs.cs401.midtermp2.srmapp;

import edu.miu.cs.cs401.midtermp2.srmapp.model.Supplier;
import edu.miu.cs.cs401.midtermp2.srmapp.model.Product;
import java.time.LocalDate;
import java.util.*;

public class SRMApp {

	public static void main(String[] args) {
		Supplier s1 = new Supplier("S101", "United Farms");
		s1.addProduct(3109128478L, "Bananas", 1.25, 480, LocalDate.of(2021, 2, 14), s1);
		s1.addProduct(2910019138L, "Apples", 1.09, 525, LocalDate.of(2021, 1, 31), s1);
		
		Supplier s2 = new Supplier("S102", "Elsegundo Agro");
		s2.addProduct(7281100287L, "Avocados", 2.49, 164, LocalDate.of(2021, 2, 11), s2);
		
		Supplier s3 = new Supplier("S103", "La Boulangerie");
		s2.addProduct(2102799156L, "Brioche", 1.89, 96, LocalDate.of(2021, 1, 4), s3);
		
		List<Supplier> s = new ArrayList<Supplier>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Supplier sup: s) {
			sup.print();
		}
	}
}

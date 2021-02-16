package edu.miu.cs.cs401.midtermp2.srmapp.model;

import java.time.LocalDate;

public class Product {
	private Long productNumber;
	private String productName;
	private double unitPrice;
	private int quantityInStock;
	private LocalDate dateSupplied;
	private Supplier supplier;
	
	public Product(Long id, String name, double price, int qty, LocalDate date, Supplier s) {
		this.productNumber = id;
		this.productName = name;
		this.unitPrice = price;
		this.quantityInStock = qty;
		this.dateSupplied = date;
		this.supplier = s;
	}

	public Long getProductNumber() {
		return productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public LocalDate getDateSupplied() {
		return dateSupplied;
	}

	public Supplier getSupplier() {
		return supplier;
	}
	
	@Override
	public String toString() {
		return productNumber+", " + productName + ", $" + unitPrice + ", " + quantityInStock
				+ ", " + dateSupplied;
	}
}

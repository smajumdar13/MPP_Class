package edu.miu.cs.cs401.midtermp2.srmapp.model;

import java.time.LocalDate;
import java.util.*;

public class Supplier {
	private String supplierId;
	private String supplierName;
	private List<Product> products = new ArrayList<Product>();
	
	public Supplier(String supplierId, String supplierName) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
	}
	
	public void addProduct(Long productNumber, String productName, double unitPrice, int quantityInStock, LocalDate dateSupplied, Supplier sup) {
		Product p = new Product(productNumber, productName, unitPrice, quantityInStock, dateSupplied, this);
		products.add(p);
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}
	
	public void print() {
		for(Product pr: products) {
			System.out.println(supplierId+", " + supplierName+", "+pr);
//			System.out.println(String.format("%10s %12s %50s", supplierId, supplierName, pr));
		}
	}
	
//	public String toString() {
//		return supplierId + ", " + supplierName + ", " + products.toString();
//	}
}

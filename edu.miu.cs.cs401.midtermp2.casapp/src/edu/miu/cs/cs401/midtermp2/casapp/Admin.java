package edu.miu.cs.cs401.midtermp2.casapp;

import java.util.*;

import javafx.scene.DepthTest;

public class Admin {
		
//	private Department[] d = {new BillingDept(), new MarketingDept(), new SalesDept()};
	private Department[] d;
	
//	public Department[] getDepartments() {
//		return d;
//	}
	
	public String hourlyCompanyMessage() {
		String message = "";
		for(Department dep: d) {
			String msg = "";
			try {
				msg = dep.nextMessage();
			} catch (EmptyQueueException e) {
				e.getMessage();
			}
			message = message + format(dep.getName(), msg);
		}
		return message;
	}
	
	Admin(Department[] dept) {
		this.d = dept;
	}
	
	public String format(String name, String message) {
		return name + ": " + message;
	}
	
}

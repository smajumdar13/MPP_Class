package mpp.assignment.lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

public class Order {
 private String orderNum;
 private List<Orderline> orderlines;
 public Order(String orderNum){
	 this.orderNum = orderNum;
	 orderlines = new ArrayList<Orderline>();
 }
 public void addOrderLine(Orderline orderline) {
	 orderlines.add(orderline);
 }
}

package edu.miu.cs.cs401.midtermp2.casapp;

public abstract class Department {
	private StringQueue queue = new StringQueue();	
	private SalesDept salesDept;
	private MarketingDept marketingDept;
	private BillingDept billingDept;
	
	Department(BillingDept bd, MarketingDept md, SalesDept sd) {
		this.billingDept = bd;
		this.marketingDept = md;
		this.salesDept = sd;
	}
	
	Department(){
		
	}
	
	public StringQueue getQueue() {
		return queue;
	}
	
	abstract String getName();
	
	public void addMessage(String message) {
		queue.enqueue(message);
	}
	
	public String nextMessage() throws EmptyQueueException {
		String s = "";
		try {
			s = this.queue.dequeue();
		} catch (EmptyQueueException e) {
			e.getMessage();
		}
		return s;
	}
}

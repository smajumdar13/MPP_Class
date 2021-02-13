package lesson4.labs.probE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double updatedBalanceSum=0;
		for(var emp: list) {
			updatedBalanceSum+=emp.computeUpdatedBalanceSum();
		}
		return updatedBalanceSum;
	}
}

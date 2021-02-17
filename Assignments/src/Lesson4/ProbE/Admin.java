package Lesson4.ProbE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double updatedBalanceSum = 0.0;
		for(var e: list) {
			updatedBalanceSum += e.computeUpdatedBalanceSum();
		}
		return updatedBalanceSum;
	}
}

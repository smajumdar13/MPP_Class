package lesson4.labs.probC;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var salEmployee = new SalariedEmployee("sal123", 800);
		var hourlyEmployee = new HourlyEmployee("hour123", 8, 40);

		var commisionEmployee = new CommissionedEmployee("comm123", 50, 750);
		var today = LocalDate.now();
		var order1 = new Order(1, LocalDate.now(), 500);
		commisionEmployee.addOrder(order1);
		Employee[] employees = { salEmployee, hourlyEmployee, commisionEmployee };
		for(var emp: employees) {
			System.out.println(emp);
			System.out.println(emp.calcCompensation(today.getMonthValue(), today.getYear()));
		}
	}

}

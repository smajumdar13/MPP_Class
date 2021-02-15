package Lesson4.ProbC;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		CommissionedEmp comm1 = new CommissionedEmp(15524, 650.0, 15.0);
		comm1.addOrder(new Order(1, today, 700.0));
		comm1.addOrder(new Order(2, today, 1500.0));
		
		HourlyEmp hE1 = new HourlyEmp(12448, 25.0, 40);
		HourlyEmp hE2 = new HourlyEmp(12652, 27.0, 32);
		
		SalariedEmp sE1 = new SalariedEmp(14654, 1400.0);
		SalariedEmp sE2 = new SalariedEmp(11553, 1700.0);
		
		Employee[] e = {comm1, hE1, hE2, sE1, sE2};
		
		for(Employee emp: e) {
			System.out.print(emp+"    "); 
			emp.print();
		}
//		
//		var Empl = List.of(new HourlyEmp(12448, 25.0, 40), new HourlyEmp(12652, 27.0, 32), 
//				new SalariedEmp(14654, 1400.0), new SalariedEmp(11553, 1700.0));
//		
//		System.out.println(Empl);
	}
}
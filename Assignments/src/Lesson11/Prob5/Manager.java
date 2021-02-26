package Lesson11.Prob5;

class Manager extends Employee {
	public Manager(String firstName,String lastName, double salary) {
		super(firstName,lastName, salary);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	private double bonus;
}

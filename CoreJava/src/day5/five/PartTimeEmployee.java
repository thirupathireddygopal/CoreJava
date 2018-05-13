package day5.five;

public class PartTimeEmployee extends Employee{
	private int days;
	private int hoursWorked;
	

	public PartTimeEmployee() {
		
	}

	public PartTimeEmployee(int id, String name, String address, int days,
			int hoursWorked) {
		super(id, name, address);
		this.days = days;
		this.hoursWorked = hoursWorked;
	}

	public double computeSalary(){
		return days*hoursWorked;
	}

}

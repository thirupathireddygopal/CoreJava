package day3.three;

public class PartTimeEmployee {
	private int id;
	private String name;
	private String address;
	private int days;
	private int hoursWorked;
	
	public PartTimeEmployee() {
		super();
		System.out.println("Hi!! i am PartTimeEmployee constructor");
	}
	
	public PartTimeEmployee(int id, String name, String address, int days, int hoursWorked) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.days = days;
		this.hoursWorked = hoursWorked;
	}
	
	public double computeSalary(){
		return days*hoursWorked;
	}
	
	public void showDetails(){
		System.out.println("id: "+ id);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("days: "+ days);
		System.out.println("Gross salary: "+computeSalary());
	}
}

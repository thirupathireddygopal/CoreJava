package day3.three;

public class FullTimeEmployee {
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public FullTimeEmployee() {
		super();
		System.out.println("Hi!! i am FullTimeEmployee constructor");
	}
	
	public FullTimeEmployee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	public double computeSalary(){
		return salary + 1000;
	}
	
	public void showDetails(){
		System.out.println("id: "+ id);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("salary: "+ salary);
		System.out.println("Gross salary: "+computeSalary());
	}
}

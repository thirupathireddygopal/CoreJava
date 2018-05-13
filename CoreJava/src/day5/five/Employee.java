package day5.five;

/*
 * An abstract class is a class which contains at least 1 abstract method.
 * We must use the keyword abstract to declare abstract class and abstract method.
 * An abstract method is a method without body/implementation.
 * An abstract class may contains concrete methods also.
 * If a class inherits abstract class that must override the abstract methods
 * We cannot create object to the abstract class but we can create a reference
   variable which invokes only known methods of abstract class but it does not
   invokes newly created methods in sub class
 */

abstract public class Employee {
	protected int id;
	protected String name;
	protected String address;
	
	// default constructor.
	public Employee() {
		super();		
	}
	
	// parameterized constructor.
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	// abstract method.
	abstract double computeSalary();	
	
	// concrete method.
	public void showDetails(){
		System.out.println("id: "+ id);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("Gross salary: "+computeSalary());
	}
	
}

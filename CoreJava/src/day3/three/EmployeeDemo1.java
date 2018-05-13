package day3.three;


public class EmployeeDemo1 {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1,"thiru","h-no:2,KaktiyaNagar",500000);
		fullTimeEmployee.showDetails();
		System.out.println("----------------");
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(1,"thiru","h-no:2,KaktiyaNagar",5,2);
		partTimeEmployee.showDetails();
	}

}

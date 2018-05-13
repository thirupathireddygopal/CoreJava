package day6.six;

//throws is used to propagate the exception handling responsibility to the caller

class AgeException1 extends Exception {
	public String toString() {
		return "Invalid Age entered...";
	}
}
class Person1 {
	private int age;
	private String name;

	public Person1() {
		super();		
	}
	public Person1(int age, String name) throws AgeException {
		super();
		if(age <= 0) {		
				throw new AgeException();
		}
		else {
			this.age = age;
			this.name = name;
		}		
	}
	public void showDetails() {
		System.out.println("Age :" + age);
		System.out.println("Name :" + name);
	}
}
public class ExceptionDemo2 {	
	public static void main(String[] args) throws AgeException {
		Person1 personOne = new Person1(25,"SACHIN");
		personOne.showDetails();
		Person1 personTwo = new Person1(-25,"KOHLI");
		personTwo.showDetails();			
	}
}






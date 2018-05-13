package day6.six;

class AgeException extends Exception{
	@Override
	public String toString() {
		return "AgeException []-->invalid age exception";
	}	
}

class Person{
	private int age;
	private String name;
	
	public Person() {
		super();	
	}
	
	public Person(int age, String name) {
		super();
		if(age <= 0){
			try {
				throw new AgeException();
			} catch (AgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			this.age = age;
			this.name = name;
		}		
	}
	
	public void showDetails(){
		System.out.println("age: " + age);
		System.out.println("name: " + name);
	}
}

public class ThrowingExceptionDemo {

	public static void main(String[] args) {
		Person personOne = new Person(24,"thiru");
		personOne.showDetails();
		
		Person personTwo = new Person(0,"gopal");
		personTwo.showDetails();
		
		System.out.println("program ended successfully....");
	}

}

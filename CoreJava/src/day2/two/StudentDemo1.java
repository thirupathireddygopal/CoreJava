package day2.two;

public class StudentDemo1 {

	public static void main(String[] args) {
		Student studentOne = new Student(9,"thirupathireddy","gopal",43000.00);
		System.out.println(studentOne); //it invokes toString() method of Student class
		studentOne.setFee(19000.00);
		System.out.println(studentOne.getFee());
		System.out.println(studentOne);
		Student studentTwo = new Student(100,"suveen","vundavalli",45000.00);
		System.out.println(studentTwo); //it invokes toString() method of Student class
		studentTwo.setId(10);		
		System.out.println(studentTwo.getId());
		System.out.println(studentTwo);
	}
}

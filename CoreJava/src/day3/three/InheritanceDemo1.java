package day3.three;

class Parent{
	protected int x,y;
	
	// default constructor
	public Parent(){
		super();
		System.out.println("now control is in parent class");
		System.out.println("Hi!!! I am a Parent default Constructor");
		System.out.println("--------END OF PARENT default----------");
	}
	
	//parameterized constructor
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
		
	public void showParent(){
		System.out.println("Hi!!! I am Parent Method");
		System.out.println("end of showParent() method.....");
	}
}

class Child extends Parent{
	int z;

	// default constructor.
	public Child(){
		super(); // it invokes super class constructor
		System.out.println("now control is in child class");
		System.out.println("hi!! i am a child default constructor");
		System.out.println("--------END OF CHILD default----------");
	}
	
	// parameterized constructor.
	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
		
	public void showChild(){
		System.out.println("hi!! i am a child method");
	}
	
	public void sum(){
		System.out.println("the sum is: "+(x+y+z));
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.showParent();
		
		Child child = new Child();
		child.showParent();
		child.showChild();
		Child child2 = new Child(10,20,30);
		child2.sum();
		
	}

}

package day4.four;

class Parent{
	public void show(){
		System.out.println("Hi!! this is the parent show method");
	}
}
class Child extends Parent{
	public void show(){
		System.out.println("hi!!  this is the child show method");
	}
}

public class OverridingDemo1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}

}

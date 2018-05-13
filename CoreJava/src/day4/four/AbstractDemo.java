package day4.four;

/*
 * An abstract class is a class which contains at least 1 abstract method.
 * We must use the keyword abstract to declare abstract class and abstract method.
 * An abstract method is a method without body/implementation.
 * An abstract class may contains concrete methods also.
 * If a class inherits abstract class that must override the abstract methods
 * We cannot create object to the abstract class but we can create a reference
   variable which invokes only known methods of abstract class but it does not
   invokes newly created methods in sub-class,so in order to call the newly 
   created method they must be a abstract method in the abstract class.
 */

abstract class Maths{
	
	// 1st abstract method- [Non-Static method]
	abstract public void sum(int x,int y);	
	
	public void sub(int x,int y){
		System.out.println("the sub is: "+(x-y));
	}
	
	/* 2nd abstract method created in order to invoke the newly created method in the class Calculate
	 * Non-static method.
	 */
	abstract public void mul(int x,int y);
}

// single Inheritance[ Maths --> Calculate]

class Calculate extends Maths{
	@Override
	public void sum(int x, int y) {
		System.out.println("The sum is: "+(x+y));		
	}
	
	public void mul(int x,int y){
		System.out.println("the mul is: "+(x*y));
	}	
}
public class AbstractDemo {

	public static void main(String[] args) {
		/* By creating an object for the sub-class[Calculate] we can call the all methods of it's 
		 * class[i.e: both override methods of extended class and newly created methods] 
		 * and also concrete methods of extended class
		*/
		Calculate calculate = new Calculate();
		calculate.sum(10, 20);
		calculate.sub(2, 5);
		calculate.mul(2, 6);
		/*
		 * We cannot create object to the abstract class but we can create a reference
   		 * variable which invokes only known methods of abstract class but it does not
   		 * invokes newly created methods in sub-class,so in order to call the newly 
   		 * created method they must be a abstracted in the abstract class.
		 */
		Maths maths = new Calculate();
		maths.sub(8, 3);
		maths.sum(8, 6);
		maths.mul(9, 6);	
	}
}

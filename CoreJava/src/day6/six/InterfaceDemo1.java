package day6.six;

/* Interface is similar to abstract method but it contains only 
 * abstract methods but not concrete methods.  It is useful for multiple inheritance in java.
 * All the rules same as abstract class.
 * It is not mandatory to write keyword abstract here
 * All the Methods are by default public abstract
 * All Variables are by default public static final 
 */

interface Inter1 {
	public void sum(int x,int y);
}
interface Inter2 {
	public void mul(int x,int y);
}

// Multiple Inheritance[ Inter1(interface1)-->Calculate(class) , Inter2(interface2)-->Calculate(Class)]
class Calculate implements Inter1,Inter2 {

	@Override
	public void mul(int x, int y) {
		System.out.println("The mul is :" + (x * y));		
	}

	@Override
	public void sum(int x, int y) {
		System.out.println("The mul is :" + (x + y));		
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
    // creating object for class Calculate using instance variable-->(calculate) for class Calculate
		Calculate calculate = new Calculate(); 
		calculate.sum(10, 20);
		calculate.mul(10, 20);
	}
}

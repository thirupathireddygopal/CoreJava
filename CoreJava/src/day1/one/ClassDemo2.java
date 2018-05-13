package day1.one;

class Sample2{
	
	private int x,y;   //instance variable :our target is to store data 
	
	//1st-method
	public void read(int x, int y){
	/* 'this' is the keyword and reference variable which holds the address of the current object
	 * It is useful when instance variable name and local variable names are same.
	 */
		this.x = x;
		this.y = y;
	}
	
	//2nd-method
	public void print(){
		System.out.println("the value of x is: " + x);
		System.out.println("the value of y is: " + y);
	}
	
	//3rd-method
	public void sum(){
		System.out.println("the sum is: "+(x+y));
	}
}

public class ClassDemo2 {

	public static void main(String[] args) {
		Sample2 obj = new Sample2();
		obj.read(10,20);
		obj.print();
		obj.sum();
		Sample2 obj2 = new Sample2();
		obj2.read(100,200);
		obj2.print();
		obj2.sum();
	}

}

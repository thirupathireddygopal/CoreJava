package day1.one;

class Sample{
	
	private int x,y;   //instance variable :our target is to store data 
	
	//1st-method
	public void read(int i, int j){ 
		x=i;
		y=j;
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

public class ClassDemo1 {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.read(10,20);
		obj.print();
		obj.sum();
		Sample obj2 = new Sample();
		obj2.read(100,200);
		obj2.print();
		obj2.sum();
	}

}

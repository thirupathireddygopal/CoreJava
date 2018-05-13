package day5.five;

class Maths{
	public void sum(int x,int y){
		System.out.println("the sum of 2 integer is:" + (x+y));
	}
	public void sum(double x,double y){
		System.out.println("the sum of 2 double is:" + (x+y));
	}
	public void sum(int x,int y,int z){
		System.out.println("the sum of 3 integer is:" + (x+y+z));
	}
}

public class OverLoadingDemo {

	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.sum(10, 20);
		maths.sum(10.0, 20.0);
		maths.sum(3, 4, 5);
	}

}

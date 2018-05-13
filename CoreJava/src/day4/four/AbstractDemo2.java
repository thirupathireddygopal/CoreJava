package day4.four;

class Maths1{
	 
	 public void sum1(int x,int y){}
	 
	 public void mul1(int x,int y){}
	 
	 public void sub(int x,int y){
		System.out.println("the sub is: "+(x-y));
	}
}

class Calucate1 extends Maths1{
	@Override
	public void sum1(int x, int y) {
		System.out.println("The sum is: "+(x+y));		
	}
	public void mul(int x,int y){
		System.out.println("the mul is: "+(x*y));
	}
	
}
public class AbstractDemo2 {
	public static void main(String[] args) {
		
		Calucate1 calucate = new Calucate1();
		
		calucate.sum1(10, 20);
		calucate.sub(2, 5);
		calucate.mul(2, 6);		
	}
}


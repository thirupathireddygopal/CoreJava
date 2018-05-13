package day6.six;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		try{
			int c = a/b;
			System.out.println("the division of a/b is: "+ c);
		}
		catch(ArithmeticException refVar){
			refVar.printStackTrace();
		}
		System.out.println("program ended successfully.....");		
	}

}

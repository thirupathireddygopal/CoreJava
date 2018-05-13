package day6.six;
//finally is guaranteed execution block
class Sample {
	public void showA() {
		System.out.println("ShowA() is started...");
		
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally of showA()...");
		}
		System.out.println("ShowA() is ended....");
	}
	public void showB() {
		System.out.println("ShowB() is started...");
		
		try {}
		catch(ArithmeticException e) {			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally of showB()...");
		}
		System.out.println("ShowB() is ended....");
	}
	public void showC() {
		System.out.println("ShowC() is started...");
		
		try {
			return;
		}
		catch(ArithmeticException e) {			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally of showC()...");
		}
		System.out.println("ShowC() is ended....");
	}
}
public class FinallyDemo1 {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.showA();
		sample.showB();
		sample.showC();

	}

}

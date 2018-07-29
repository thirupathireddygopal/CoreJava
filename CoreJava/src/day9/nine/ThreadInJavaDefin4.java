package day9.nine;

public class ThreadInJavaDefin4 {

	public static void main(String[] args) {
		
		//Thread as a Local Inner Class using Thread class
		class Class1D4 extends Thread{
			@Override
			public void run() {
				System.out.println("Threads as a non static inner class using Thread class");
			}
		}
		//Another Thread as a Local Inner Class using Runnable Interface
		class Class2D4 implements Runnable{
			@Override
			public void run() {
				System.out.println("Threads as a non static inner class using Runnable Interface");
			}
		}
		
		Class1D4 c1 = new Class1D4();
		c1.start();
		
		Class2D4 c2 = new Class2D4();
		Thread t = new Thread(c2);
		t.start();
	}

}

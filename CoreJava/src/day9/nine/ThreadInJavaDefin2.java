package day9.nine;

public class ThreadInJavaDefin2 {
	
	static class Class1D2 extends Thread{
		@Override
		public void run() {
			System.out.println("Threads as a static inner class using Thread class");
		}
	}
	
	static class Class2D2 implements Runnable{
		@Override
		public void run() {
			System.out.println("Threads as a static inner class using Runnable Interface");
		}
	}
	public static void main(String[] args) {
		
		Class1D2 c1 = new Class1D2();
		c1.start();
		
		Class2D2 c2 = new Class2D2();
		Thread t = new Thread(c2);
		t.start();
	}

}

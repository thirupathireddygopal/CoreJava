package day9.nine;

public class ThreadInJavaDefin3 {
	
	class Class1D3 extends Thread{
		@Override
		public void run() {
			System.out.println("Threads as a non static inner class using Thread class");
		}
	}
	
	class Class2D3 implements Runnable{
		@Override
		public void run() {
			System.out.println("Threads as a non static inner class using Runnable Interface");
		}
	}
	public static void main(String[] args) {
		ThreadInJavaDefin3 i = new ThreadInJavaDefin3();
		
		Class1D3 c1 = i.new Class1D3();
		c1.start();
		
		Class2D3 c2 = i.new Class2D3();
		Thread t = new Thread(c2);
		t.start();
	}

}

package day9.nine;

class Thread1J1 extends Thread{
	@Override
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("threadJ1 i values :" + i);
		}
	}
}

class Thread1J2 extends Thread{
	public void run() {
		for(int i = 6 ; i <= 10 ; i++) {
			System.out.println("threadJ2 i values : " + i);
		}
	}
}
public class ThreadsInJava1 {
	
	// main thread
	public static void main(String[] args) {

		//creating 1st thread using java.lang.Thread class
		Thread1J1 t1 = new Thread1J1();
		t1.start();
		
		// creating 2nd thread
		Thread1J2 t2 = new Thread1J2();
		t2.start();
	}

}

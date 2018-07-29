package day9.nine;

class Thread2J1 implements Runnable{
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("threadJ2 i values : " + i);
		}
	}
}
public class ThreadsInJava2 {

	public static void main(String[] args) {
		
		//creating 1st thread using java.lang.Runnable Interface
		Thread2J1 ref = new Thread2J1();
		Thread t1 = new Thread(ref);
		t1.start();
	}

}

package day9.nine;

class MyThreadN1 extends Thread{
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("retriving thread name :" + i);
		}
	}
}
public class ThreadInJavaNaming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadN1 t1  = new MyThreadN1();
		System.out.println("default thread name : " + t1.getName()); // default thread name
		
		t1.setName("My Thread-0"); // changing the name of thread before starting
		System.out.println("thread name : " + t1.getName());
		
		t1.start();
		t1.setName("MyThread-1"); // changing the name when thread is in active state
		System.out.println("thread name : " + t1.getName());
		
		try {
			t1.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.setName("My Thread-2"); // changing the name of the thread when thread is sleeping
		System.out.println("after 5 seconds thread name---> : " + t1.getName());
	}

}

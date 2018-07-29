package day9.nine;

public class ThreadInJavaUserThread extends Thread{
	
	public void run() {
		Thread t = new Thread();
		System.out.println("checking user thread : " + t.isDaemon());
	}
	public static void main(String[] args) {
		
		//Creating the UserThread
		ThreadInJavaUserThread t1 = new ThreadInJavaUserThread();
		t1.start();
		
		//Creating the DaemonThread
		ThreadInJavaUserThread t2 = new ThreadInJavaUserThread();
		t2.setDaemon(true);
		t2.start();
	}

}

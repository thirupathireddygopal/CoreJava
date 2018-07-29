package day9.nine;

public class ThreadInJavaDefin5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				System.out.println("Threads used in anonumous class using Thread class");
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Threads used in anonumous class using Runnable Interface");
			}
		}).start();
	}

}

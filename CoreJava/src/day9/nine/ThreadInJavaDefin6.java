package day9.nine;

public class ThreadInJavaDefin6 extends Thread{
	
	public void run() {
		System.out.println("class itself acts like a thread ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadInJavaDefin6 t = new ThreadInJavaDefin6();
		t.start();
	}

}

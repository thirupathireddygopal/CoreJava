package day9.nine;

class UserThread extends Thread{
	public void run() {
		System.out.println("user thread......................................");
	}
}

class DaemonThread extends Thread{
	public DaemonThread() {
		setDaemon(true);
	}
	public void run() {
		for(int i = 1 ; i <= 500 ; i++) {
			System.out.println("Daemon thread.." + i);
		}		
	}
}
public class ThreadInJavaUserAndDaemon{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread
		 daemon.start();
		 
		 UserThread user = new UserThread();
		 user.start();
	}

}

package day9.nine;

class SeparateConcreteThread extends Thread{
	@Override
	public void run() {
		System.out.println("separate concrete thread method is used");
	}
}

class UsageSCT1{
	void run() {
		SeparateConcreteThread t = new SeparateConcreteThread();
		t.start();
	}
}

class UsageSCT2{
	void run() {
		SeparateConcreteThread t = new SeparateConcreteThread();
		t.start();
	}
}
public class ThreadInJavaDefin1 {

	public static void main(String[] args) {
		SeparateConcreteThread t = new SeparateConcreteThread();
		t.start();
		UsageSCT1 u1 = new UsageSCT1();
		u1.run();
		UsageSCT2 u2 = new UsageSCT2();
		u2.run();		
	}

}

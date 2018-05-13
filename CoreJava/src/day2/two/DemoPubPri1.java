package day2.two;

public class DemoPubPri1 {

	public static void main(String[] args) {
		DemoPubPri2 obj = new DemoPubPri2();
		obj.a = 30;
		// obj.b=20-->throws error since b is private 
		obj.read();
	}

}

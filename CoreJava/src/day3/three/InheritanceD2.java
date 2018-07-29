package day3.three;

class X
{
	static String s = "AAA";
	int m = 1111;
	int k = 101010;

	static {
		s = s + "BBB";
	}

	{
		m = m++;
		System.out.println(m);
	}

	public X(int i)
	{
		System.out.println(1);
	}

	public X() {
		// TODO Auto-generated constructor stub
		k = k++ + k-- - k;
	}

	static int staticMethod1(int k) {
		System.out.println("--k value : " + --k);
		return --k;
	}
}

class Y extends X
{
	static{
		s = s + "BBBAAA";
	}
	{
		System.out.println("s value : " + s);
		System.out.println(methodOne());
	}

	int methodOne() {
		System.out.println("m value : " + m);
		m = m++ + --m;
		return m;
	}
	public Y()
	{
		System.out.println(staticMethod1(k));
	}
}
public class InheritanceD2 {
	public static void main(String[] args) {
		Y y = new Y();
	}
}

package day3.three;

class ArrayParent
{
	int[] a = new int[5];

	{
		a[0] = 10;
		System.out.println("a[0] : " + a[0]);
	}
}

public class InheritanceD5 extends ArrayParent{
	{
		a = new int[5];

	}

	{
		System.out.println(a[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceD5 inherit = new InheritanceD5();
	}

}

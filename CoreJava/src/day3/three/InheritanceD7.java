package day3.three;

class ClassID7
{
    static int i = 111;
     
    int j = 222;
     
    {
        i = i++ - ++j;
        System.out.println("i value in IIB-ClassID7 : " + i);
        System.out.println("j value in IIB-ClassID7 : " + j);
    }
}

public class InheritanceD7 extends ClassID7{

	{
		System.out.println("i value in IIB-InheritanceD7 : " + i);
        j = i-- + --j;
        System.out.println("j value in IIB-InheritanceD7 : " + j);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceD7 inherit = new InheritanceD7();
	}

}

package day3.three;

class StaticInt
{
    static int i;
 
    static
    {
        i++;
        System.out.println("i value SIB : " + i);
    }
 
    {
        ++i;
        System.out.println("i value IIB : " + i);
    }
}
public class InheritanceD6 extends StaticInt{

	static
    {
        --i;
        System.out.println("i value subclass SIB : " + i);
    }
 
    {
        i--;
        System.out.println("i value subclass IIB : " + i);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new StaticInt().i);
	}

}

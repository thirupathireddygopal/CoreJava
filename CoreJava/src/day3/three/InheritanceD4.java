package day3.three;

class ClassOne
{
     static int i, j = 191919; // i = 0(default)
 
     {
         --i;
         System.out.println("i value IIB : " + i);
     }
 
     {
         j++;
         System.out.println("j value IIB: " + j);
     }
}

public class InheritanceD4 extends ClassOne{

	static
    {
        i++;
        System.out.println("i value in SIB : " + i);
    }
 
    static
    {
        --j;
        System.out.println("j value in SIB :" + j);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		 
        System.out.println(j);
	}

}

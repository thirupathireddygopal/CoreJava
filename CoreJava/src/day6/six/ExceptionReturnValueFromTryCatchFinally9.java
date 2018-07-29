package day6.six;

public class ExceptionReturnValueFromTryCatchFinally9 {
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            int i = Integer.parseInt("123");
            System.out.println(i);
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}

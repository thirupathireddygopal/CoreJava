package day6.six;

public class ExceptionReturnValueFromTryCatchFinally1 {
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    @SuppressWarnings("finally")
	static int methodReturningValue()
    {
        try
        {
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e)
        {
            //This block may or may not return a value as finally block is returning a value
        }
        finally
        {
            return 20;
        }
    }
}

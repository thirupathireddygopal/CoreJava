package day6.six;

public class ExceptionReturnValueFromTryCatchFinally4 {
	public static void main(String[] args)
    {
        System.out.println(methodReturningValue());    //Output : 50
    }
 
    @SuppressWarnings("finally")
	static int methodReturningValue()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            return 50;    //This method returns 50 not 10 or 20
        }
    }
}

package day6.six;

public class ExceptionReturnValueFromTryCatchFinally3 {
	@SuppressWarnings("finally")
	public static void main(String[] args)
    {
        try
        {
            return;
        }
        catch (Exception e)
        {
            return;
        }
        finally
        {
            return;
        }
 
        //System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
    }
}

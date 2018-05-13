package day6.six;

public class ArrayIndexException {

	public static void main(String[] args) {
		try{
			System.out.println("enter values in command line arguments for args[0]=x,args[1]=1,args[2]=3");
			
			/*if we give args[0]=(xyz) value which is string 
			 *it throws [NumberFormatException] since we store the value in the form of Integer
			 */
			int a = Integer.parseInt(args[0]);
		
			/* if we provide value for args[2] instead of args[3] in the command line arguments
			 * it throws an error [ArrayIndexOutOfBoundException]
			 */
			int b = Integer.parseInt(args[1]); 
			System.out.println("the value of a-->" + a + "the value of b-->" + b);
			int c = Integer.parseInt(args[3]); 
			System.out.println("the value of b-->" + b + "the value of c-->" + c);
		}catch(Exception refVar){
			refVar.printStackTrace();
		}
		System.out.println("program ended successfully.....");
	}

}

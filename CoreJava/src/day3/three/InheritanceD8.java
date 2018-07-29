package day3.three;

class D8A
{
    private int i;
 
    private void methodOfClassD8A()
    {
        //Private Method
        System.out.println(i);  //Private field can be used within class
        D8B b = new D8B();          //Private inner class can be used within class
    }
 
    private class D8B
    {
      //Private Inner Class
    }
}
 
class D8C extends D8A
{
    void methodOfClassD8C()
    {
        //System.out.println(i);  Private member can not be inherited
        D8A a = new D8A();
        //System.out.println(a.i);     Private field can not be used outside the class
        //a.methodOfClassA();          Private method can not be used outside the class
        //A.B b = new A.B();           Private inner class can not be used outside the class
        methodOfClassD8A();
    }
    private void methodOfClassD8A(){
         System.out.println("seperate private method got called");  
    }
}

public class InheritanceD8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D8C c= new D8C();
	}

}

package day6.six;

import java.util.Scanner;

interface AdvancedArithmetic{
	  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
  public int divisor_sum(int n){
      int sum = 0;
      for(int i = 1 ; i <= n ; i++){
          if(n % i == 0){
              sum += i;
          }
      }
      return sum;
  }
}

public class InterfaceDemo3HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator my_calculator = new MyCalculator();
		
		System.out.print("I implemented: ");
		
		// calling method
		ImplementedInterfaceNames(my_calculator);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer to get sum of its divisors");
		int n = sc.nextInt();
		
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}
	/*
	 *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
	 */
	static void ImplementedInterfaceNames(Object o){
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++){
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}



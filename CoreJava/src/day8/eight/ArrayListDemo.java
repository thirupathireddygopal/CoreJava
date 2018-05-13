package day8.eight;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <Customer> arrayList = new ArrayList <Customer> ();
		Customer customerOne = new Customer(100,"sachin",999.9);
		arrayList.add(customerOne);
		Customer customerTwo = new Customer(101,"yuvi",666.6);
		arrayList.add(customerTwo);
		for(Customer cust:arrayList){
			System.out.println("id: " + cust.getId());
			System.out.println("name: "+cust.getName());
			System.out.println("balance: "+cust.getBalance());
			System.out.println("----------------------------");
		}
	}

}

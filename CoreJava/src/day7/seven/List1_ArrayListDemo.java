package day7.seven;

import java.util.ArrayList;
import java.util.Iterator;

public class List1_ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList =  new ArrayList<Integer>();
		arrayList.add(309);
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(509);
		arrayList.add(2);
		arrayList.add(2089);
		arrayList.add(20);
		arrayList.add(209);
		arrayList.add(203);
		arrayList.add(202);
		arrayList.add(2002);
		arrayList.add(200);
		System.out.println(arrayList);
		
		//for loop
		int sum = 0;
		for(Integer x : arrayList){
			sum  += x;
		}
		System.out.println("the sum of the arrayList using for loop is: "+ sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()){
			sum += it.next();
		}
		System.out.println("the sum of array list using while loop is: " + sum);
	}

}

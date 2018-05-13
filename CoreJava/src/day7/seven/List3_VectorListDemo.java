package day7.seven;

import java.util.Iterator;
import java.util.Vector;

public class List3_VectorListDemo {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(309);
		vector.add(100);
		vector.add(100);
		vector.add(509);
		vector.add(2);
		vector.add(2089);
		vector.add(20);
		vector.add(209);
		vector.add(203);
		vector.add(202);
		vector.add(2002);
		vector.add(200);
		System.out.println(vector);
		
		//for loop
		int sum = 0;
		for(Integer x : vector){
			sum += x;			
		}
		System.out.println("the vector sum using for loop is: " + sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = vector.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			sum += it.next();
		}
		System.out.println("the vector sum using while loop is: " + sum);
	}

}

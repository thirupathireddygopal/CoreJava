package day7.seven;

import java.util.Iterator;
import java.util.LinkedList;

public class List2_LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(309);
		linkedList.add(100);
		linkedList.add(100);
		linkedList.add(509);
		linkedList.add(2);
		linkedList.add(2089);
		linkedList.add(20);
		linkedList.add(209);
		linkedList.add(203);
		linkedList.add(202);
		linkedList.add(2002);
		linkedList.add(200);
		System.out.println(linkedList);
		
		//for loop
		int sum = 0;
		for(Integer x : linkedList){
			sum += x;
		}
		System.out.println("the sum using for loop is:" + sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println("entered while loop");
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			sum += it.next();
		}
		System.out.println("the sum using while loop is: " + sum);
	}

}

package day7.seven;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set2_LinkedHashSetDemo {
	/*LinkedHashSet implements Set interface which does not allow duplicates	
	 */

	public static void main(String[] args) {
		// LinkedHashSet guarantee the order of retrieval in which elements are added. 
		LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(309);
		linkedHashSet.add(100);
		linkedHashSet.add(100);
		linkedHashSet.add(509);
		linkedHashSet.add(2);
		linkedHashSet.add(2089);
		linkedHashSet.add(20);
		linkedHashSet.add(209);
		linkedHashSet.add(203);
		linkedHashSet.add(202);
		linkedHashSet.add(2002);
		linkedHashSet.add(200);
		System.out.println(linkedHashSet);
		
		//forEach loop
		int sum = 0;
		for(Integer x :linkedHashSet){
			sum = sum + x;
		}
		System.out.println("the sum using LinkedHashSet is: " + sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = linkedHashSet.iterator();
		while(it.hasNext()){
			sum += (Integer)it.next();
		}
		System.out.println("the whileSum by Iterator is: " + sum);
	}

}

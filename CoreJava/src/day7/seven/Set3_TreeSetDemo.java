package day7.seven;

import java.util.Iterator;
import java.util.TreeSet;

public class Set3_TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(309);
		treeSet.add(100);
		treeSet.add(100);
		treeSet.add(509);
		treeSet.add(2);
		treeSet.add(2089);
		treeSet.add(20);
		treeSet.add(209);
		treeSet.add(203);
		treeSet.add(202);
		treeSet.add(2002);
		treeSet.add(200);
		System.out.println(treeSet);
		
		//forEach loop
		int sum = 0;
		for(Integer x : treeSet){
			sum += x;
		}
		System.out.println("the sum of treeSet using for loop is: "+ sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = treeSet.iterator();
		while(it.hasNext()){
			sum += it.next();
		}
		System.out.println("the sum of treeSet using while loop is: "+ sum);
	}

}

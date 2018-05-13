package day7.seven;

import java.util.HashSet;
import java.util.Iterator;

public class Set1_HashSetDemo {
	/*
	 Frameworks are large bodies (usually many classes and interfaces)
	 of pre_written code to which we add our own code to solve a 
	 problems in a specific domain by calling its methods,  
	 
	Java Collection simply means a single unit of objects. 
	Java Collection framework provides many interfaces (Set, List, Map 
	etc.) and classes (ArrayList, Vector, LinkedList, 
	HashSet,  TreeSet, LinkedHashSet,HashMap, HashTable,.. etc).
	*/
	
	//HashSet implements Set interface which does not allow duplicates
	

	public static void main(String[] args) {
		//HashSet does not guarantee the order of retrieval in which elements are added
		HashSet <Integer>hashSet = new HashSet<Integer>();
		hashSet.add(309);
		hashSet.add(100);
		hashSet.add(100);// duplicate
		hashSet.add(509);
		hashSet.add(2);
		hashSet.add(2089);
		hashSet.add(20);
		hashSet.add(209);
		hashSet.add(203);
		hashSet.add(202);
		hashSet.add(2002);
		hashSet.add(200);
		System.out.println(hashSet);
		
		//forEach loop
		int sum = 0;
		for(Integer x :hashSet){
			sum += x;
		}
		System.out.println("sum obtained using for loop: "+sum);
		
		//while loop
		sum = 0;
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()){
			sum += (Integer)it.next();
		}
		System.out.println("sum obtained using while loop iterator(): "+sum);
	}

}

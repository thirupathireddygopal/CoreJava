package day7.seven;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//It stores in the form of (key,value) pairs.  Here key must be unique
   
public class Map1_HashMapDemo1 {
	public static void main(String[] args) {
		HashMap <String,Integer>hashMap = new HashMap<String,Integer>();
		hashMap.put("SACHIN", 66);
		hashMap.put("DHONI", 45);
		hashMap.put("KOHLI", 77);
		hashMap.put("ROHITH", 57);
		hashMap.put("YUVI", 88);
		hashMap.put("SACHIN", 99);
		
		System.out.println("Printing [keys:values] hashMap-->" + hashMap);
		System.out.println("Printing value of particular key [var.get(key)=value]-->" + hashMap.get("ROHITH"));
		
		Set<String> set = hashMap.keySet();
		System.out.println("Printing all keys[i.e: KeySet()]-->" + set);
		
		Collection<Integer> values = hashMap.values();
		System.out.println("printing all values-->" + values);
		
		System.out.println(hashMap.containsKey("JADHAV"));
		System.out.println(hashMap.containsKey("KOHLI"));
	}
}








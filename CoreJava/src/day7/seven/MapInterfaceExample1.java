package day7.seven;

import java.util.*;
import java.util.Map.Entry;

// generic-new style

/* Map.Entry Interface 
 * Entry is the sub interface of Map. 
 * So we will be accessed it by Map.Entry name. It provides methods to get key and value.
 * Object getKey(),Object getValue() 
 */
class MapInterfaceExample1{  

	public static void main(String args[]){  

		Map<Integer,String> map = new HashMap<Integer,String>();  

		map.put(100,"Amit");  
		map.put(101,"Vijay");  
		map.put(102,"Rahul");

		// all key and values
		System.out.println("map-->" + map);
		System.out.println("------------------------------------");

		// map.entrySet()
		System.out.println("map.entrySet()-->" + map.entrySet());
		System.out.println("------------------------------------");

		// getting keySet
		System.out.println("map.keySet()-->" + map.keySet());
		System.out.println("------------------------------------");

		//getting valueSet
		System.out.println("map.values()-->" + map.values());
		System.out.println("------------------------------------");

		// containsKey and containsValue-->boolean type 
		System.out.println("map.containsKey('key')-->" + map.containsKey(100));
		System.out.println("map.containsVlaue(value)-->" + map.containsValue("vijay"));
		System.out.println("------------------------------------");

		//removing the map entry
		System.out.println("map.remove(key)-->" + map.remove(102));
		System.out.println("------------------------------------");

		//getting value of key
		System.out.println("map.get('key')-->" + map.get(100));
		System.out.println("------------------------------------");



		// map.entrySet()
		for(Map.Entry<Integer, String> m : map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println("map.entryset().......");
		System.out.println("------------------------------------");		

		//Traversing Map
		//Converting to Set so that we can traverse 
		Set<Entry<Integer, String>> set = map.entrySet();

		Iterator<Entry<Integer, String>> it = set.iterator();  

		while(it.hasNext()){
			//Converting to Map.Entry so that we can get key and value separately  
			Entry<Integer, String> entry = it.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}
		System.out.println("------------------------------------");
	}  
}

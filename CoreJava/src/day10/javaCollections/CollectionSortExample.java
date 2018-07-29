package day10.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionSortExample {

	public static void main(String[] args) {
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(8);
		ls1.add(16);
		ls1.add(3);
		Collections.sort(ls1);
		Iterator<Integer> it1 = ls1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("------------------------");
		List<String> ls = new ArrayList<String>();
		ls.add("shiva");
		ls.add("anu");
		ls.add("manasa");
		Collections.sort(ls);
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

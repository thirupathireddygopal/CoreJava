package day10.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {

	public static void main(String[] args) {
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(1);
		ls1.add(9);
		ls1.add(20);
		System.out.println("maximum value from the collection : " + Collections.min(ls1));
		System.out.println("maximum value from the collection : " + Collections.max(ls1));
		System.out.println("-----------------------------------");
		List<String> ls = new ArrayList<String>();
		ls.add("C Pgm");
		ls.add("Core Java");
		ls.add("Advanced Java");
		System.out.println("Inital collection values : " + ls +" of size : " + ls.size());
		Collections.addAll(ls, "Servlets","JSP");
		System.out.println("collection values after adding elements : "+ ls +" of size : " + ls.size());
		String[] strArr = {".Net","AI"};
		Collections.addAll(ls, strArr);
		System.out.println("collection values after adding string array values : " + ls +" of size : " + ls.size());
	}

}

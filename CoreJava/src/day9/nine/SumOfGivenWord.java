package day9.nine;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfGivenWord {
	
	public static int getWordSum(String str){
		int result = 0;
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		int n;
		map.put('A', 0);
		map.put('B', 1);
		for(int i = 2 ; i < str1.length() ; i++){
			System.out.println("map.get(str1.charAt(i-1))+map.get(str1.charAt(i-2))-->"+(map.get(str1.charAt(i-1))+map.get(str1.charAt(i-2))));
			//System.out.println("map.get(str1.charAt(i-2))-->"+map.get(str1.charAt(i-2)));
			n = map.get(str1.charAt(i-1))+map.get(str1.charAt(i-2));
			map.put(str1.charAt(i), n);
			System.out.println("map.put(str1.charAt(i), n)-->"+map.put(str1.charAt(i), n));
		}
		
		for(int i = 0 ; i < str.length() ; i++){
			result += map.get(str.toUpperCase().charAt(i));
			System.out.println("result-->" + result);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word :");
		String word = sc.next();
		int result = getWordSum(word);
		System.out.println("the sum of the word is: " + result );
	}

}

package day7.seven;

import java.util.HashMap;
import java.util.Map;
/*
 Fill the following method with the code to find occurrence of each
 character in the given string and store in a map object then return.
 
 Ex:- Input :- HELLO WORLD
   	  Output :- {H=1, E=1, L=3, O=2, W=1, R=1, D=1}
 */

public class CharacterOccurrenceMapDemo {
	public static Map<Character, Integer> getCharacterOccurrence(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();  //Map=interface,map = referenceVar
		
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String str = "HELLO WORLD";
		Map result = getCharacterOccurrence(str);
		System.out.println(result);
	}
}

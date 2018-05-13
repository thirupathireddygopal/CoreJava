import java.util.*;
public class Anagrams01 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "elbow", "part", "panel", "trap", "tensil", "alter", "later", "below"};
        List<String> anagrams = findAnagrams(words);
        for (String word : anagrams) {
            System.out.println(word);
        }
    }

    public static List<String> findAnagrams(String[] words) {
      Map<String, String> mapObj = new LinkedHashMap<String,String>();
      for(String str : words){
    	  String str1 = sortString(str);
    	  if(mapObj.containsKey(str1)){
    		  mapObj.put(str1, (String)mapObj.get(str1)+","+str);
    		  //System.out.println("values-->"+ (String)mapObj.get(str1)+","+str1);
    	  }
    	  else{
    		mapObj.put(str1, str);  
    	  }
      }
      //System.out.println(mapObj);
      //System.out.println("keySet()-->"+mapObj.keySet());
      
      List<String> anagramList = new LinkedList<String>();      
  		for(String str : mapObj.values()){
  			if(str.contains(",")){
  				anagramList.add(str);
  			}
  		}
  		//System.out.println("anagramList-->" + anagramList);
  	return anagramList;
    }
    
    public static String sortString(String str){
    	str.toLowerCase();
    	char c[] = str.toCharArray();
    	Arrays.sort(c);
    	//String str2 = String.valueOf(c);
    	//System.out.println("str2-->" + str2);
    	String sortedStr = new String(c);
    	//System.out.println("sortedStr-->" + sortedStr);
    	return sortedStr;    	
    }   
}

/*
 * String[] words1 = { "silent", "elbow", "part", "panel"};
        List<String> anagrams = findAnagrams(words1);
        System.out.println(anagrams);//result is-->[]
        if(anagrams.isEmpty())
        	System.out.println("emptylist");
        for (String word : anagrams) {
            System.out.println(word);
        }
 */


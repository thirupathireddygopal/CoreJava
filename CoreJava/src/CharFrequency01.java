import java.util.*;
public class CharFrequency01 {
	public static void main(String[] args) {
		Map<Character, Integer> freqCount = frequencyCount("ELEMENTS");
        System.out.println(freqCount);
        
        for (Character key : freqCount.keySet()) {
            System.out.println(key + " " + freqCount.get(key));
        }  
        
	}
    public static Map<Character, Integer> frequencyCount(String str) {
    	Map<Character, Integer> frequencyCount = new LinkedHashMap<Character,Integer>();
    	if(str == null) {
    		return frequencyCount;
    	}
    	if(str.length() == 0) {
    		return frequencyCount;
    	}
    	str = str.trim();
    	str = str.toUpperCase();
    	for(char ch :str.toCharArray()) {
    		if(frequencyCount.containsKey(ch)) {
    			frequencyCount.put(ch, (Integer)frequencyCount.get(ch)+1);
    		}
    		else {
    			frequencyCount.put(ch, 1);
    		}
    	}
    	return frequencyCount;
    }
}
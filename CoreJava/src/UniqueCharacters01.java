import java.util.*;
public class UniqueCharacters01 {
    public static void main(String[] args) {
        String str = "ENGINEERING";
        Set<Character> uniqAlphs = getUniqueLetters(str);
        System.out.println(uniqAlphs);
    }

    public static Set<Character> getUniqueLetters(String str) {
    	Set<Character> uniqueAlphs = new TreeSet<Character>();
    	
    	if(str == null) {
    	return uniqueAlphs;
    	}
    	// trimming the leading and trailing white_spaces
    	str = str.trim();
    	
    	if(str.length() == 0) {
    		return uniqueAlphs;
    	}
    	
    	for(char ch : str.toCharArray()) {
    		if(Character.isLetter(ch) || Character.isDigit(ch)) {
    			uniqueAlphs.add(ch);
    		}
    	}
    	
    	return uniqueAlphs;
    }
}
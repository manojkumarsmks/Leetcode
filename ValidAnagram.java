// https://leetcode.com/problems/valid-anagram/description/
import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> set = new HashMap();
		
		for (int i = 0; i < s.length(); i++) {
			if(set.containsKey(s.charAt(i)))
				set.put(s.charAt(i), set.get(s.charAt(i))+1);
			else 
				set.put(s.charAt(i), 1);
		}
		
		for (int i = 0; i < t.length(); i++) {
			if(set.containsKey(t.charAt(i)))
				set.put(t.charAt(i), set.get(t.charAt(i))-1);
			else 
				return false;
		}
		
		
		Set<Character> temp = set.keySet();
		
		for(Character character : temp) {
			if(set.get(character) != 0)
				return false;
		}
		
		return true;
    }

}

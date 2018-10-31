// https://leetcode.com/problems/roman-to-integer/description/
import java.util.HashMap;

public class Roman2Integer {

	public static void main(String[] args) {
		String value = "MCMXCIV";
		System.out.println(romanToInt(value));
	}
	
	private static int romanToInt(String str) {
        HashMap<String, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put("I", 1);
        romanToInteger.put("V", 5);
        romanToInteger.put("X", 10);
        romanToInteger.put("L", 50);
        romanToInteger.put("C", 100);
        romanToInteger.put("D", 500);
        romanToInteger.put("M", 1000);
        romanToInteger.put("IV", 4);
        romanToInteger.put("IX", 9);
        romanToInteger.put("XL", 40);
        romanToInteger.put("XC", 90);
        romanToInteger.put("CD", 400);
        romanToInteger.put("CM", 900);
        
        int totalSum = 0;
        int i = 0;
        while(i < str.length()){
        	
        	if(i != str.length()-1 && romanToInteger.containsKey(str.substring(i, i+2))) {
        		totalSum += romanToInteger.get(str.substring(i, i+2));
        		i += 2;
        	}
        	else {
        		totalSum += romanToInteger.get(Character.toString(str.charAt(i)));
        		i++;
        	}
			
		}
        
        return totalSum;
        
    }

}

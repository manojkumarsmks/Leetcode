// http://www.techiedelight.com/find-binary-strings-can-formed-given-wildcard-pattern/
// Possible combinations
package RecursionII;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combination {

	public static void main(String[] args) {
		String s = "1?11?00?1?";
		printCombination(s);
	}
	
	//TODO should be debugged 
	public static void printAllCombinations(String pattern)
    {
		char[] charArray = pattern.toCharArray();
		if(!pattern.contains("?"))
			return;
		
		List<Integer> position = new ArrayList<>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '?') {
				position.add(i);
				charArray[i] = '0';
			}
		}
		
		pattern = charArray.toString();
		
		for (int i = 0; i < Math.pow(2, position.size()); i++) {
			char[] patternArray = new char[charArray.length];
			patternArray = charArray;
			int temp = i;
			StringBuilder sb = new StringBuilder();
			
			while(temp > 0) {
				sb.insert(0, temp%2);
				temp = temp/2;
				if(temp == 1) {
					sb.insert(0, temp);
					break;
				}
			}
			System.out.println("Binary of i "+i +"  "+sb.toString());
			for(int j = 0; j < position.size(); j++) {
				if(j < sb.length()) {
					patternArray[position.get(position.size()-1-j)] = sb.charAt(j);
				}
			}
			
			//System.out.println(pattern);
			System.out.println(new String(patternArray));
			System.out.println("--------------------");
		}
		
    }

	// Iterative method 
	public static void printCombination(String pattern) {
		
		if(!pattern.contains("?") || pattern.length() == 0)
			return;
		
		Stack<String> stack = new Stack<String>();
		stack.push(pattern);
		
		while(!stack.isEmpty()) {
			String temp = stack.pop();
			if(temp.contains("?")) {
				
				int unknownIndex = temp.indexOf("?");
				String withZero = temp.substring(0, unknownIndex) +'0' + temp.substring(unknownIndex+1);
				String withOne = temp.substring(0, unknownIndex) + '1' + temp.substring(unknownIndex+1);	
				stack.push(withZero);
				stack.push(withOne);		
			}
			else {
				System.out.println(temp);
			}
			
		}
		
			
	}
}

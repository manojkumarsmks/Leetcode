import java.util.Stack;

// https://leetcode.com/problems/reverse-only-letters/description/
public class ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters(";1yDV"));
	}
	
    public static String reverseOnlyLetters(String S) {
    	
    	if(S.length() <= 1)
    		return S;
    	
    	Stack<Character> stack = new Stack<>();
    	
    	for(char ch:S.toCharArray()) {
    		
    		if((ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))
    			stack.push(ch);
    	}
    	StringBuilder stringBuilder = new StringBuilder();
    	
    	for(int i=0; i<S.length(); i++) {	
    		if((S.charAt(i) >='a' && S.charAt(i) <= 'z') || (S.charAt(i) >='A' && S.charAt(i) <= 'Z'))
    			stringBuilder.append(stack.pop());
    		else
    			stringBuilder.append(S.charAt(i));
    	}
    	
    	return stringBuilder.toString();
    }

}

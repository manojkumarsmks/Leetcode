// https://leetcode.com/problems/valid-parentheses/description/
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
	}
	
	public static boolean isValid(String s) {
        
		Stack<Character> stack = new Stack<>();
		
		for(char c:s.toCharArray()) {
			if(c == '{') {
				stack.push('}');
			}
			else if(c == '(') {
				stack.push(')');
			}
			else if (c == '[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != c)
				return false;
		}
		
		if(stack.isEmpty())
		    return true;
        else 
            return false;

    }

}

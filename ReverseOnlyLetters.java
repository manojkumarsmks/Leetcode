// https://leetcode.com/problems/reverse-only-letters/description/
import java.util.Stack;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters(";1yDV"));
	}
	
	// Stack Based Solution
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
    
    // Pointer based solution
    public String reverseOnlyLetters2(String S) {
        int i = 0, j = S.length()-1;
        char[] SArray = S.toCharArray();
        while(i < j) {
            
            if(Character.isAlphabetic(SArray[i]) && Character.isAlphabetic(SArray[j])) {
                char temp = SArray[i];
                SArray[i] = SArray[j];
                SArray[j] = temp;
                i++;
                j--;
            }
           else if (Character.isAlphabetic(SArray[i]) && !Character.isAlphabetic(SArray[j])) {
                j--;
            }
            else if (!Character.isAlphabetic(SArray[i]) && Character.isAlphabetic(SArray[j])) {
                i++;
            }
            else {
                i++;
                j--;
            }
            
        }
        
        return new String(SArray);
        
    }

}

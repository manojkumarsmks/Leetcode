// https://leetcode.com/problems/reverse-only-letters/description/
public class ReverseOnlyLetters {

	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
	}
	
    public static String reverseOnlyLetters(String S) {
    	
    	char[] sArray = S.toCharArray();
    	
    	int start = 0, end = sArray.length-1;
    	
    	while(start < end) {
    		
    		if(((sArray[start] >= 'a'  && sArray[start] <= 'z') || (sArray[start] >= 'A'  && sArray[start] <= 'Z'))
    				&&((sArray[end] >= 'a'  && sArray[end] <= 'z') || (sArray[end] >= 'A'  && sArray[end] <= 'A'))) {
    			char temp = sArray[start];
    			sArray[start] = sArray[end];
    			sArray[end] = temp;
    			start++;
    			end--;
    		}
    		
    		if(((sArray[start] >= 'a'  && sArray[start] <= 'z') || (sArray[start] >= 'A'  && sArray[start] <= 'Z'))
    				&&(!(sArray[end] >= 'a'  && sArray[end] <= 'z') && !(sArray[end] >= 'A'  && sArray[end] <= 'A')))
    		end--;
    		
    		if((!(sArray[start] >= 'a'  && sArray[start] <= 'z') && !(sArray[start] >= 'A'  && sArray[start] <= 'Z'))
    				&&((sArray[end] >= 'a'  && sArray[end] <= 'z') || (sArray[end] >= 'A'  && sArray[end] <= 'A')))
    		start++;
    		
    		else {
    			start++;
    			end--;
    		}
    	}
    	
    	return new String(sArray);
        
    }

}

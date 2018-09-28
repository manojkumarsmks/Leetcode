// https://leetcode.com/problems/string-compression/description/ 
public class StringCompression {

	public static void main(String[] args) {
		char[] chars = {'a','b','c'};
		System.out.println("RESTULT"+compress(chars));
	}
	
	public static int compress(char[] chars) {
		if(chars.length < 2)
			return chars.length;
		
		int writingPointer = 0, pointer = 0;
		
		while(pointer < chars.length) {
			char temp = chars[pointer];
			int counter = 0;
			while(pointer < chars.length && temp == chars[pointer]) {
				pointer++;
				counter++;
			}
			chars[writingPointer++] = temp;
			if(counter != 1) 
				for(char c:Integer.toString(counter).toCharArray()) {
					chars[writingPointer++] = c;
				}
		}
		
		return writingPointer;
		
	}
}

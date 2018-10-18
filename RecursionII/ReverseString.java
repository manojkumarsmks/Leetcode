// write a recursive solution to revese a string
// input - Manoj Kumar
// ouput - ramuk jonaM
package RecursionII;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reveseString("Manoj Kumar"));
	}
	
	public static String reveseString(String s) {
		return reverseStringHelper(0, s.length()-1, s.toCharArray());
	}

	private static String reverseStringHelper(int i, int length, char[] s) {
		
		if(i > length)
			return new String(s);
		
		char temp = s[i];
		s[i] = s[length];
		s[length] = temp;
		i++;
		length--;
		
		return reverseStringHelper(i, length, s);
		
	}

}

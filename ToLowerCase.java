// https://leetcode.com/problems/to-lower-case/description/
public class ToLowerCase {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(toLowerCase(str));
	}
	
	public static String toLowerCase(String str) {
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i<strArray.length;i++) {
			if(strArray[i] >= 'A' && strArray[i] <='Z') {
				strArray[i] = (char) ('a'+(strArray[i]-'A'));
			}
		}
		return new String(strArray);
	}
}

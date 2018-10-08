// https://codingbat.com/prob/p186177
package Recursion;

public class StrCount {

	public static void main(String[] args) {
		System.out.println(strCount("xyx", "x"));
	}
	
	public static int strCount(String str, String sub) {
		if(str.length() < sub.length())
			return 0;
		if(str.substring(0, sub.length()).equals(sub))
			return 1 + strCount(str.substring(sub.length()), sub);
		else
			return strCount(str.substring(1), sub);
	}

}

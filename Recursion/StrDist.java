// https://codingbat.com/prob/p195413
package Recursion;

public class StrDist {

	public static void main(String[] args) {
		System.out.println(strDist("catcowcat", "cow"));
	}
	
	public static int strDist(String str, String sub) {
		if(str.length() < sub.length())
			return 0;
		
		if((str.substring(0, sub.length()).equals(sub))
			&& str.substring(str.length()-sub.length(), str.length()).equals(sub)) {
			return str.length();
		}
		
		if((str.substring(0, sub.length()).equals(sub))
			&& !str.substring(str.length()-sub.length(), str.length()).equals(sub)) {
			return strDist(str.substring(0, str.length()-1), sub);
		}
		
		else return strDist(str.substring(1, str.length()), sub);
	}
}

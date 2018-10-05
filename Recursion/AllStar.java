// https://codingbat.com/prob/p183394
package Recursion;

public class AllStar {

	public static void main(String[] args) {
		System.out.println(allStar("hello"));
	}
	
	public static String allStar(String str) {
		if(str.length() <= 1)
			return str;
		else 
			return str.charAt(0) + "*" + allStar(str.substring(1));
	}

}

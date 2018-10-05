// https://codingbat.com/prob/p105722
package Recursion;

public class endX {

	public static void main(String[] args) {
		System.out.println(endX("xhixhix"));
	}
	
	public static String endX(String str) {
		
		if(str.length() <= 0)
			return "";
		if(str.charAt(0) == 'x')
			return endX(str.substring(1)) + 'x';
		return str.charAt(0) + endX(str.substring(1));
	}


}

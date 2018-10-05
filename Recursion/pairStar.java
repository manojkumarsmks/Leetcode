// https://codingbat.com/prob/p158175
package Recursion;

public class pairStar {

	public static void main(String[] args) {
		System.out.println(pairStar("hello"));
	}
	
	public static String pairStar(String str) {
		  if(str.length() <=  1)
			  return str;
		  if(str.charAt(0) ==str.charAt(1))
			  return str.charAt(0) + "*" + pairStar(str.substring(1));
		  return str.charAt(0) + pairStar(str.substring(1));				  
	}


}

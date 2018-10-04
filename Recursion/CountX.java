// https://codingbat.com/prob/p170371
package Recursion;

public class CountX {

	public static void main(String[] args) {
		System.out.println(countX("xhixhix"));
	}
	
	public static int countX(String str) {
		if(str.equals(""))
		  return 0;
		if(str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));
		else
			return countX(str.substring(1));
	}
}

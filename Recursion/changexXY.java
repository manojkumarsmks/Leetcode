// https://codingbat.com/prob/p101372
package Recursion;

public class changexXY {

	public static void main(String[] args) {
		System.out.println(changeXY("xhixhix"));
	}
	
	public static String changeXY(String str) {
		if(str.length() == 0)
			return "";
		if(str.charAt(0) == 'x')
			return 'y' + changeXY(str.substring(1));
		else
			return str.charAt(0) + changeXY(str.substring(1));
		
	}


}

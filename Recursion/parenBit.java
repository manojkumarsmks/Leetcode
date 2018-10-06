// https://codingbat.com/prob/p137918
package Recursion;

public class parenBit {

	public static void main(String[] args) {
		System.out.println(parenBit("x(hello)"));
	}
	
	public static String parenBit(String str) {
		if(str.length() == 0)
			return "";
		if(str.charAt(0) == '(' && str.charAt(str.length()-1)==')')
			return str.substring(1, str.length()-1);
		if (str.charAt(0) == '(' && str.charAt(str.length()-1) != ')') 
			return parenBit(str.substring(0, str.length()-1));
		if (str.charAt(0) != '(' && str.charAt(str.length()-1) == ')') 
			return parenBit(str.substring(1, str.length()));
		else
			return parenBit(str.substring(1, str.length()-1));
			
	}

}

// https://codingbat.com/prob/p143900
package Recursion;

public class CountHi2 {

	public static void main(String[] args) {
		System.out.println(countHi2("hixhhi"));
	}
	
	public static int countHi2(String str) {
		if(str.length() <= 1)
			return 0;
		if(str.length() > 2 && str.substring(0,3).equals("xhi"))
			return countHi2(str.substring(3));
		if(str.substring(0, 2).equals("hi"))
			return 1 + countHi2(str.substring(2));
		else
			return countHi2(str.substring(1));
	}

}

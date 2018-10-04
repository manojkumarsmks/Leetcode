// https://codingbat.com/prob/p184029
package Recursion;

public class countHi {

	public static void main(String[] args) {
		System.out.println(countHi("xxhixx"));
	}
	
	public static int countHi(String str) {
		if(str.length() <2)
			return 0;
		if(str.substring(0, 2).equals("hi"))
			return 1 + countHi(str.substring(1));
		else
			return countHi(str.substring(1));
	}

}

// https://codingbat.com/prob/p161124
package Recursion;

public class CountAbc {

	public static void main(String[] args) {
		System.out.println(countAbc("abaxxaba"));
	}
	
	public static int countAbc(String str) {
		if(str.length() <3)
			return 0;
		if(str.substring(0, 3).equals("abc") || str.substring(0,3).equals("aba"))
			return 1 + countAbc(str.substring(1));
		else
			return countAbc(str.substring(1));
	}
}



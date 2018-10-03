// https://codingbat.com/prob/p163932
package Recursion;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(49));
	}
	
	public static int sumDigits(int n) {
		if(n == 0)
			return 0;
		else 
			return ((n%10) + sumDigits(n/10));
	}

}

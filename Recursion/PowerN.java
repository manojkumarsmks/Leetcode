// https://codingbat.com/prob/p158888
package Recursion;

public class PowerN {

	public static void main(String[] args) {
		System.out.println(powerN(3,2));
	}
	
	public static int powerN(int base, int n) {
		if(n < 1)
			return 1;
		return base * powerN(base, n-1);
	}

}

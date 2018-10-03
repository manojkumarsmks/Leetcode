//https://codingbat.com/prob/p183649
package Recursion;

public class BunnyEars {

	public static void main(String[] args) {
		BunnyEars bunnyEars = new BunnyEars();
		System.out.println(bunnyEars.bunnyEars(5));
	}
	
	// Solution
	public int bunnyEars(int bunnies) {
		if(bunnies == 0)
			return 0;
		return bunnyEars(bunnies-1) +2;
	}

}

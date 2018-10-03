// https://codingbat.com/prob/p107330
package Recursion;

public class BunnyEars2 {

	public static void main(String[] args) {
		BunnyEars2 bunnyEars = new BunnyEars2();
		System.out.println(bunnyEars.bunnyEars2(10));
	}
	
	public int bunnyEars2(int bunnies) {
		if(bunnies == 0)
			return 0;
		if(bunnies % 2 == 0)
			return 3 + bunnyEars2(bunnies-1);
		else 
			return 2 + bunnyEars2(bunnies-1);	
	}

}

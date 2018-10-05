// https://codingbat.com/prob/p135988
package Recursion;

public class array11 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 11};
		System.out.println(array11(nums, 0));
	}
	
	public static int array11(int[] nums, int index) {
		if(index >= nums.length)
			return 0;
		if(nums[index] == 11)
			return 1 + array11(nums, index+1);
		else 
			return array11(nums, index+1);
	}

}

// https://codingbat.com/prob/p173469
package Recursion;

public class Array220 {

	public static void main(String[] args) {
		int[] nums = {20, 2, 21};
		System.out.println(array220(nums, 0));
	}
	
	public static boolean array220(int[] nums, int index) {
		if(index >= nums.length-1)
			return false;
		if(nums[index+1] == 10*nums[index])
			return true;
		return array220(nums, index+1);
		  
	}


}

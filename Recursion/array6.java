// https://codingbat.com/prob/p108997
package Recursion;

public class array6 {

	public static void main(String[] args) {
		int[] nums =  {1,6,4};
		System.out.println(array6(nums, 0));
	}
	
	public static boolean array6(int[] nums, int index) {
		if(index >= nums.length)
			return false;
		if(nums[index] == 6)
			return true;
		else
			return array6(nums, index+1);
	}

}

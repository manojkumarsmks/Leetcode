// https://leetcode.com/problems/rotate-array/
public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 2;
		
		rotateC(nums, k);
	}
	
	// Brute Force method
	public static void rotate(int[] nums, int k) {
		
		if(nums.length < 2)
			return;
		
		if(k > nums.length-1) {
			k %= nums.length;
		}
		if(k == 0)
			return;
		
		while(k != 0) {
			
			int temp = nums[nums.length-1];
			for(int i = nums.length-1; i >0; i--) {
				nums[i] = nums[i-1];
			}
			nums[0] = temp;
			k--;
		}
		for(Integer integer:nums)
			System.out.println(integer);
	}
	
	// Using another array
	public static void rotateB(int[] nums, int k) {
		int[] temp = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			temp[(i+k)%nums.length] = nums[i];
		}
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
	}
	
	//Reversing the arrays
	public static void rotateC(int[] nums, int k) {
		if(nums.length < 2)
            return;
        if(k > nums.length)
            k %= nums.length;
        
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums,k, nums.length-1);
		for(Integer integer:nums)
			System.out.println(integer);
	}
	
	public static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;	
		}
	}
}

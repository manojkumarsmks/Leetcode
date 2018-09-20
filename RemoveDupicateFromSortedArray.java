// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDupicateFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length < 2)
			return nums.length;

		int counter = 1;
		int temp = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] != temp) {
				temp = nums[i];
				nums[counter] = nums[i];
				counter++;
			}
			
		}
	
		return counter;

	}
}

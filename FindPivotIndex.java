// https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = {-1,-1,-1,-1,0,-1};
		System.out.println(pivotIndex(nums));
	}
	
	public static int pivotIndex(int[] nums) {
		if (nums == null || nums.length <= 1)
			return -1;
		
		int sum = 0;
		
		for(int x:nums) {
			sum += x;
		}
		
		int left  =0, right = sum;
		for(int i =0; i < nums.length; i++) {
			sum -= nums[i];
			if(sum == left)
				return i;
			left += nums[i];
		}
		
		return -1;
	}

}

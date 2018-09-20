// https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaximumAverageSubArrayI {

	public static void main(String[] args) {
		int[] nums = {0,4,0,3,2};
		System.out.println(findMaxAverage(nums, 1));
	}
	
	// Sliding window problem
	public static double findMaxAverage(int[] nums, int k) {
		
		if(nums.length < k )
			return 0.0;
		
		// Instead of writing two for loops, one for i to k n other for k to length of array
		// Write if else conditions
		double sum = 0, average = 0;
		for (int i = 0; i < nums.length; i++) {
			if(i < k) {
				sum += nums[i];
				average = sum;
			}
			else  {
				double temp = (sum - nums[i-k]+ nums[i]);
				average = Math.max(temp, average);
				sum = temp;
			}
				
		}
		return (average/k);
	}

}

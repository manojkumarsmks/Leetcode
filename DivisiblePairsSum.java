// https://www.hackerrank.com/challenges/linkedin-practice-divisible-sum-pairs/problem
public class DivisiblePairsSum {

	public static void main(String[] args) {
		int[] nums = {1,3,2,6,1,2};
		System.out.println(DivisiblePairs(nums, 3));
	}
	// O(N^2) Brute force method
	public static int DivisiblePairs(int[] nums, int k) {
		
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((nums[i]+nums[j])%k == 0)
					counter++;
			}
		}
		
		
		return counter;
	}

}

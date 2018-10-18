// https://codingbat.com/prob/p145416
package RecursionII;

public class GroupSum {

	public static void main(String[] args) {
		int[] nums = {2,4,8};
		System.out.println(groupSum(0, nums, 9));
	}
	
	public static boolean groupSum(int start, int[] nums, int target) {
		if(start > nums.length-1)
			return (target == 0);
		if(groupSum(start+1, nums, target-nums[start]))
			return true;
		if(groupSum(start+1, nums, target))
			return true;
		return false;
	}

}

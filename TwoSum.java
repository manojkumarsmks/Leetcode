import java.util.HashMap;
import java.util.Set;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		for(Integer integer:twoSum(nums, 9)) {
			System.out.println(integer);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		
		int[] answer = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				answer[0] = map.get(target-nums[i]);
				answer[1] = i;
			}
			else { 
				map.put(nums[i], i);
			}
		}
		
		return answer;
	}
}

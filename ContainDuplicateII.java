// https://leetcode.com/problems/contains-duplicate-ii/
import java.util.HashMap;

public class ContainDuplicateII {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearByDuplicate(nums, k));
	}
	
	// Works if the i-j == k 
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k > nums.length-1)
        	return false;
        
        int i = 0, j = k;
        
        while(j < nums.length) {
        	if(nums[i] == nums[j])
        		return true;
        	j++;
        	i++;
        }
        
        return false;
    }
	
	// Question says i-j can be at most k
	public static boolean containsNearByDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
			{
				if(Math.abs(map.get(nums[i]) - i) <= k)
					return true;
				else {
					map.put(nums[i], i);
				}
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return false;
	}

}

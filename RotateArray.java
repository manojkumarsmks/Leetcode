
public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {-1,-100,3,99};
		int k = 2;
		
		rotate(nums, k);
	}
	
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

}

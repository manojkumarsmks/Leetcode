import java.util.Arrays;

// https://leetcode.com/problems/counting-bits/description/
public class CountingBits {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
	
	public static int[] countBits(int num) {
		int index = num+1;
		int[] result = new int[index];
		
		while(num >= 0) {
			index--;
			result[index] = OnesCount(num);
			num--;
		}
		
		return result;
		
	}
	
	public static int OnesCount(int num) {
		int count = 0;
		while(num > 0) {
			if(num % 2 == 1) 
				count++;
			num = num /2;
		}
		return count;
	}

}

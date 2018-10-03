// https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {

	public static void main(String[] args) {
		hammingDistance(1, 4);
	}
	
	public static int hammingDistance(int x, int y) {
		int result = x ^ y;
		int counter = 0;
		for(int i =0; i<32; i++) {
			if(((result  >> i) & 1) == 1)
				counter++;
		}
		
		return counter;
	}

}

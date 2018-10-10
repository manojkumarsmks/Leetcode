// https://leetcode.com/problems/number-complement/description/
public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(1));
	}
	
	public static int findComplement(int num) {
		
		int bitCounter = 0, temp = num;
		StringBuilder string = new StringBuilder();
		while(num > 0) {
			bitCounter++;
			num = num/2;
		}
		
		for (int i = 0; i < bitCounter; i++) {
			string.append('1');
		}
		
		String str = string.toString();
		int binary = Integer.parseInt(str, 2);
		
		return temp ^ binary;
    }

}

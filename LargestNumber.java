// https://leetcode.com/problems/largest-number/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		int[] num = {3,30,34,5,9};
		System.out.println(largestNumber(num));
	}
	
	@SuppressWarnings("unchecked")
	public static String largestNumber(int[] num) {
		

		List<String> list = new ArrayList<String>();
		
		for(Integer integer:num)
			list.add(String.valueOf(integer));
		
		Comparator comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				return s2.compareTo(s1);
			}
		};
		
		Collections.sort(list, comparator);
		StringBuilder stringBuild = new StringBuilder();
		for(String strng:list) {
			stringBuild.append(strng);
		}
		
		return stringBuild.toString();
		
	}

}

// https://leetcode.com/problems/boats-to-save-people/
import java.util.Arrays;

public class BoatsToSavePeople {

	public static void main(String[] args) {
		int[]  people = {3,5,3,4};
		System.out.println(numRescueBoats(people, 5));
	}

	 public static int numRescueBoats(int[] people, int limit) {
		 if(people.length == 0)
			 return 0;
		 
		 else if(people.length == 1)
			 return 1;
		
		 Arrays.sort(people);
		 // 1,2,2,3
		 // 3,3,4,5
		 int i = 0, j = people.length-1;
		 int boat = 0;
		 while (i <= j) {
			 if(people[i] + people[j] > limit) {
				 boat++;
				 j--;
			 }
			 else if(i == j) {
				 boat++;
				 break;
			 }
			 else {
				boat++;
				i++;
				j--;
			 }
	     }
		 return boat;
	 }
}

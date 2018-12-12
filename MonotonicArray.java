// https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {

	public static void main(String[] args) {
		int[] A = {1,2,2,3};
		
		System.out.println(monotonicCheck(A));
	}
	
	public static boolean isMonotonic(int[] A) {
		
		if(A.length-1 < 2) {
			return true;
		}
		
		boolean decider = false;
		int first = 0, second = 1;
		while(second < A.length-1) {
			if(A[first] != A[second])
				break;
			second++;
		}
		// decider = false ---- decreasing
		// decider = true ----- increasing
		if(A[first] > A[second])
			decider = false;
		if(A[first] < A[second])
			decider = true;
		first = 0; second = 1;
		
		if(!decider) {	
			while(second < A.length) {
				if(A[first] >= A[second]) {
					first++;
					second++;
				}
				else {
					return false;
				}
			}
		}
		else if(decider) {	
			while(second < A.length) {
				if(A[first] <= A[second]) {
					first++;
					second++;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	// Better written code
	
	public static boolean monotonicCheck(int[] A) {
		if(A.length < 2)
			return true;
		return isIncreasing(A) || isDecreasing(A); 
	}

	private static boolean isIncreasing(int[] a) {
		int i = 0, j = 1;
		while(j < a.length) {
			if(a[i] <= a[j]) {
				i++;
				j++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isDecreasing(int[] a) {
		int i = 0, j = 1;
		while(j < a.length) {
			if(a[i] >= a[j]) {
				i++;
				j++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
}

// Binary Search 
public class BinarySearch {

	public static void main(String[] args) {
		int [] array = {5};
		
		System.out.println(Search(array, array.length-1, 0, 5));
	}

	public static int Search(int[] array, int high, int low, int element) {
		
		if(high < low)
			return -1;
		
		int mid = low +(high-low)/2;
		
		if(array[mid] == element) {
			return mid;
		}
		
		if(array[mid]>element)
			return Search(array, mid-1, low, element);
		else
			return Search(array, high, mid+1, element);
		
	}
}


public class LongestUncommonSubsequenceI {

	public static void main(String[] args) {
		String a  = "abc";
		String b  = "cdc";
		
		System.out.println(findLUSlenght(a, b));
	}
	
	public static int findLUSlenght(String a, String b) {
		if(a.length() != b.length())
			return a.length() > b.length()? a.length() : b.length();
		else {
			return a.equals(b) ? -1 : a.length() > b.length()? a.length() : b.length();
		}
	}

}

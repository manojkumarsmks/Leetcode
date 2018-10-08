// https://codingbat.com/prob/p118182
package Recursion;

public class StrCopies {

	public static void main(String[] args) {
		System.out.println(strCopies("catcowcat", "cow", 2));
	}
	
	public static boolean strCopies(String str, String sub, int n) {
		  if(n == 0)
			  return true;
		  if(str.length() < sub.length())
			  return false;
		  if(str.substring(1).equals(sub))
			  return strCopies(str.substring(sub.length()), sub, n-1);
		  else
			  return strCopies(str.substring(1), sub, n);
	}

}

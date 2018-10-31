// https://leetcode.com/problems/unique-email-addresses/
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		numUniqueEmails(emails);
	}

	private static int numUniqueEmails(String[] emails) {
		
		Set<String> set = new HashSet<>();
		
		for (String s:emails) {
			String[] domain = s.split("@");
			String email = parseLocal(domain[0]);
			set.add(email+"@"+domain[1]);
		}
		
		for (String string : set) {
			System.out.println(string);
		}
		
		
		return set.size();
	}

	private static String parseLocal(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(char c:s.toCharArray()) {
			if(c != '.') {
				if(c == '+')
					return sb.toString();
				sb.append(c);
			}
		}
		return sb.toString();
	}

}

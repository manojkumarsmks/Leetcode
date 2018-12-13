// https://leetcode.com/problems/license-key-formatting/
public class LicenceKeyFormatting {

	public static void main(String[] args) {
		System.out.println(licenseFormatting("5F3Z-2e-9-w", 4));
	}

	public static String licenseFormatting(String s, int K) {
		s = s.replaceAll("-", "");
		
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		int first = s.length() % K;
		if (first > 0) {
			while (i < s.length() && first != 0) {
				if (s.charAt(i) != '-') {
					if (Character.isLowerCase(s.charAt(i))) {
						stringBuilder.append(Character.toUpperCase(s.charAt(i)));
					} else {
						stringBuilder.append(s.charAt(i));
					}
					first--;
				}
				i++;
			}
			stringBuilder.append('-');
		}
		int temp = 0;
		while (i < s.length()) {
			if (s.charAt(i) != '-') {
				if (Character.isLowerCase(s.charAt(i))) {
					stringBuilder.append(Character.toUpperCase(s.charAt(i)));
				} else {
					stringBuilder.append(s.charAt(i));
				}
				temp++;
			}
			if (temp == K && i != s.length() - 1) {
				stringBuilder.append('-');
				temp = 0;
			}
			i++;
		}

		return stringBuilder.toString();
	}

}

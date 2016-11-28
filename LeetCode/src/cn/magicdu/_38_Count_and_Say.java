package cn.magicdu;

public class _38_Count_and_Say {
	public String countAndSay(int n) {
		if (n == 1) {
			return 1 + "";
		}
		String str = countAndSay(n - 1) + "*";
		int count = 1;
		String s = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				s = s + count + str.charAt(i);
				count = 1;
			}
		}
		return s;
	}
}

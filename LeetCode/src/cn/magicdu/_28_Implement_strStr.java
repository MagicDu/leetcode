package cn.magicdu;

public class _28_Implement_strStr {
	public int strStr(String haystack, String needle) {
		int hayl = haystack.length();

		if (needle.length() > haystack.length()) {
			return -1;
		}
		if (haystack.equals(needle)) {
			return 0;
		}
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (haystack.substring(i, needle.length() + i).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}

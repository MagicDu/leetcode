package cn.magicdu;

public class _58_Length_of_Last_Word {
	public int lengthOfLastWord(String s) {
		s=s.trim();
		int lastIndex = s.lastIndexOf(' ') + 1;
		return s.length() - lastIndex;
	}
}

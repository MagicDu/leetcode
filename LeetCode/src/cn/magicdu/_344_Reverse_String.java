package cn.magicdu;

public class _344_Reverse_String {
	public String reverseString(String s) {
		//StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}
}

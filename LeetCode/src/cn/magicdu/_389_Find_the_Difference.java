package cn.magicdu;

public class _389_Find_the_Difference {
	 public char findTheDifference(String s, String t) {
		 int c=t.charAt(0);
	        for (int i=0; i<s.length(); i++) c=c^s.charAt(i);
	        for (int i=1; i<t.length(); i++) c=c^t.charAt(i);
	        return (char)c;
	    }
}

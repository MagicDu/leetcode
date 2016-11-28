package cn.magicdu;

import java.util.HashMap;
import java.util.Map;

public class _409_Longest_Palindrome {
	public int longestPalindrome(String s) {
		int size = s.length();
		if (size == 0 || s == null)
			return 0;
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		int result=0;
		boolean flag=false;
		for(char c:map.keySet()){
			int f=map.get(c);
			if(f%2==0){
				result+=f;
			}else{
				flag=true;
				result+=f-1;
			}
		}
		return result+(flag?1:0);
	}
}

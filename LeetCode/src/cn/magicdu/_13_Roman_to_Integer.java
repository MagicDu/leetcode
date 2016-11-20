package cn.magicdu;

import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {
	public int romanToInt(String s) {
        if (s == null || s.length() == 0) return -1;
            Map <Character,Integer> map=new HashMap<Character,Integer>();
	        map.put('M', 1000);
	        map.put('D', 500);
	        map.put('C', 100);
	        map.put('L', 50);
	        map.put('X', 10);
	        map.put('V', 5);
	        map.put('I', 1);
	        int len = s.length();
            int result = map.get(s.charAt(len-1));
        
           for(int i = 0; i<=len-2; i++){
            int value = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));
            
            if(value >= nextVal) {
                result += value;
            }
            else {
                result -= value;
            }
        }
        return result;
        
    }
}

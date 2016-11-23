package cn.magicdu;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_Valid_Parentheses {
	public boolean isValid(String s) {
		if (s == null || s.length() == 1 || s.length() % 2 != 0) {
			return false;
		}
		boolean flag = false;
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && stack.empty()) {
				return false;
			} else if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
				flag = true;
				if (stack.pop() != map.get(s.charAt(i))) {
					return false;
				}
			}
		}
		return flag;
	}
}

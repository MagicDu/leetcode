package cn.magicdu;

public class _9_Palindrome_Number {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int t = 0;
		int sum = 0;
		int flag = x;
		while (x != 0) {
			t = x % 10;
			x /= 10;
			sum = sum * 10 + t;
		}
		if (sum == flag) {
			return true;
		} else {
			return false;
		}
	}
}

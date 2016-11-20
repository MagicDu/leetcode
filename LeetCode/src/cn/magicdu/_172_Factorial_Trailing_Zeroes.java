package cn.magicdu;

public class _172_Factorial_Trailing_Zeroes {
	public int trailingZeroes(int n) {
		int t = 0;
		while (n != 0) {
			n /= 5;
			t += n;
		}
		return t;
	}
}

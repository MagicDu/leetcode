package cn.magicdu;

public class _326_Power_of_Three {
	public boolean isPowerOfThree(int n) {
		int num = n;
		while (num > 0 && num % 3 == 0)
			num /= 3;
		return num == 1;
	}
	// return n > 0 && (1162261467 % n == 0);
}

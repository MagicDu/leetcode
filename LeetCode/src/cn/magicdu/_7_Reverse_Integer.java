package cn.magicdu;

public class _7_Reverse_Integer {
	public int reverse(int x) {
		int sum = 0;
		while (x != 0) {
			// 溢出判断
			long t = (long) sum * 10;
			if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
				return 0;
			}
			sum = sum * 10 + x % 10;
			x /= 10;
		}
		return sum;
	}
}

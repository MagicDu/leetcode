package cn.magicdu;

public class _342_Power_of_Four {
	public boolean isPowerOfFour(int num) {
		int n = num;
		while (n > 0 && n % 4 == 0) {
			n /= 4;
		}
		return n == 1;
		// return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555)
		// == num);
	}
}

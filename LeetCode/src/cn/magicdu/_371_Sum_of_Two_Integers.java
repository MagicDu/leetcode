package cn.magicdu;

public class _371_Sum_of_Two_Integers {
	public int getSum(int a, int b) {
		int sum = 0, carry = 0;
		do {
			sum = a ^ b;
			carry = (a & b) << 1;
			a = sum;
			b = carry;
		} while (carry != 0);
		return sum;
	}
}

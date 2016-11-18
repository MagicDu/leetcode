package cn.magicdu;

import java.math.BigInteger;

public class _8_String_to_Integer_atoi {
	public int myAtoi(String str) {
		char[] strArr = str.trim().toCharArray();
		StringBuffer sb = new StringBuffer();
		BigInteger bt;
		int flag = 1;
		int i = 0;
		if (strArr.length < 1) {
			return 0;
		} else {
			if (strArr[0] == '-') {
				flag = -1;
				i++;
			}
			if (strArr[0] == '+') {
				flag = 1;
				i++;
			}
			if (strArr[0] == '0') {
				i++;
			}
		}
		for (; i < strArr.length; i++) {
			if (Character.isDigit(strArr[i])) {
				sb.append(strArr[i]);
			} else {
				break;
			}

		}

		if (sb == null || sb.toString().equals("")) {
			return 0;
		} else if ((bt = new BigInteger(sb.toString())).compareTo(new BigInteger("9223372036854775808")) > 0) {
			if (flag == 1) {
				return Integer.MAX_VALUE;
			} else {
				return Integer.MIN_VALUE;
			}
		} else if (Long.parseLong(sb.toString()) > Integer.MAX_VALUE) {
			if (flag == 1) {
				return Integer.MAX_VALUE;
			} else {
				return Integer.MIN_VALUE;
			}
		}
		if (sb.toString().equals("")) {
			return 0;
		}
		return flag * Integer.parseInt(sb.toString());
	}
}

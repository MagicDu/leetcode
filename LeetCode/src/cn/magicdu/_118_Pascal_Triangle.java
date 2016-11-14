package cn.magicdu;

import java.util.ArrayList;
import java.util.List;

public class _118_Pascal_Triangle {

	public List<List<Integer>> generate(int numRows) {
		if (numRows < 0) {
			return null;
		}
		List<List<Integer>> l1 = new ArrayList<>();
		if (numRows >= 1) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			l1.add(list);
		}
		if (numRows >= 2) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(1);
			l1.add(list);
		}
		if (numRows >= 3) {
			for (int i = 3; i <= numRows; i++) {
				List<Integer> list = new ArrayList<>();
				List<Integer> prev = l1.get(i - 2);
				list.add(1);
				for (int j = 2; j <= i - 1; j++) {
					list.add(prev.get(j - 2) + prev.get(j - 1));
				}
				list.add(1);
				l1.add(list);
			}

		}

		return l1;
	}

}

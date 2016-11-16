package cn.magicdu;

import cn.magicdu.extra.ListNode;

public class _2_Add_Two_Numbers_UN {
	public static ListNode addTwoNum(ListNode l1, ListNode l2) {
		int sum = 0;
		ListNode p, l3 = new ListNode(0);
		p = l3;
		while (l1 != null || l2 != null || sum != 0) {
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			System.out.println(sum);
			p.next = new ListNode(sum % 10);
			sum /= 10;
			p = p.next;
		}

		return l3.next;
	}
}

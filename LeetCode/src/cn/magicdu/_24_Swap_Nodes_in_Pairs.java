package cn.magicdu;

import cn.magicdu.extra.ListNode;

public class _24_Swap_Nodes_in_Pairs {
	public ListNode swapPairs(ListNode head) {
		ListNode l1 = null;
		if (head == null || head.next == null)
			return head;
		l1 = head.next;
		head.next = l1.next;
		l1.next = head;
		head.next = swapPairs(head.next);
		return l1;

	}
}

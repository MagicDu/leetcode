package cn.magicdu;

import cn.magicdu.extra.ListNode;

public class _114_Linked_List_Cycle {
	public boolean hasCycle(ListNode head) {
		ListNode fast = head, slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;

	}
}
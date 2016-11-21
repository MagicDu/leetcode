package cn.magicdu;

import cn.magicdu.extra.ListNode;

public class _206_Reverse_Linked_List {
	/**
	 * 迭代
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode l = new ListNode(0);
		l.next = head;
		ListNode pre = head;
		ListNode p = pre.next;
		while (p != null) {
			pre.next = p.next;
			p.next = l.next;
			l.next = p;
			p = pre.next;
		}
		return l.next;
	}
	
	
	/**
	 * 递归
	 * @param head
	 * @return
	 */
	public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
}

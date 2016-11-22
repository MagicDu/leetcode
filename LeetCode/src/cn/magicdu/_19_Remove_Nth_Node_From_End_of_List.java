package cn.magicdu;

import cn.magicdu.extra.ListNode;

public class _19_Remove_Nth_Node_From_End_of_List {
	public ListNode removeNthFromEnd(ListNode head, int n) {
	       ListNode result=new ListNode(0);
	       result.next=head;
	       ListNode fast=head;
	       ListNode slow=result;
	      
	       for(int i=0;i<n;i++){
	           fast=fast.next;
	       }
	       while(fast!=null){
	           fast=fast.next;
	           slow=slow.next;
	       }
	       slow.next=slow.next.next;
	       return result.next;
	    }
}

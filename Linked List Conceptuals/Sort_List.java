package linkedlist.qps;

public class Sort_List {
	
//	  Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode sortList(ListNode head) {
	    	if(head==null || head.next==null)
	    		return head;
	        
	    	
	    	ListNode mid = middleHalf(head);
	    	ListNode midnext = mid.next;
	    	mid.next=null;
	    	ListNode fs = sortList(head);
	    	ListNode ss = sortList(midnext);
	    	
	    	return mergeTwoList(fs,ss);
	    }

		public ListNode mergeTwoList(ListNode first, ListNode second) {
			// TODO Auto-generated method stub
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			
			while(first!=null && second!=null)
			{
				if(first.val>second.val)
				{
					temp.next = second;
					temp = temp.next;
					second = second.next;
				}
				else
				{
					temp.next = first;
					first = first.next;
					temp = temp.next;
				}
			}
			
			if(first!=null)
				temp.next = first;
			else
				temp.next = second;
			
			return dummy.next;
		}

		public ListNode middleHalf(ListNode head) {
			// TODO Auto-generated method stub
			ListNode slow = head;
			ListNode fast = head;
			while(fast.next!=null && fast.next.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			
			return slow;
		}
	}
}

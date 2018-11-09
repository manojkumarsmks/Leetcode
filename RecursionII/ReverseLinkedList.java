package RecursionII;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		head = reverseList(head);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		
		if(head == null)
			return null;
		
		ListNode first, second , third;
		
		first = head;
		
		second = head.next;
		if(second == null)
			return first;

		third = head.next.next;
		if(third == null) {
			second.next = first;
			first.next = null;
			
			return second;
		}
		
		while(third != null) {
			second.next = first;
			first = second;
			second = third;
			third = third.next;
		}
		
		second.next = first;
		head.next = null;
		
		return second;
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		this.val = x;
	}
}

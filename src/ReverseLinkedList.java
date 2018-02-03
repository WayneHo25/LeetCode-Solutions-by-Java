public class ReverseLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(5);
        node.next = new ListNode(6);
        node.next.next = new ListNode(7);

        ListNode result = new ReverseLinkedList().reverseList(node);
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
    }
}

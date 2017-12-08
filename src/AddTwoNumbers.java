public class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(7);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(7);

        ListNode result = new AddTwoNumbers().addTwoNumbers(node1, node2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
        ListNode first = l1, second = l2, curr = dummyHead;
        int carry = 0;
        while (first != null || second != null) {
        		int x = (first != null) ? first.val : 0;
            int y = (second != null) ? second.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (first != null) first = first.next;
            if (second != null) second = second.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

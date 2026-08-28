class Solution {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode fwd = head;
        while (current != null) {
            fwd = current.next; 
            current.next = prev;             
            prev = current;                   
            current = fwd;             
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverseList(l1);
        ListNode revL2 = reverseList(l2);
        
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        int carry = 0;
    
        while (revL1 != null || revL2 != null || carry != 0) {
            int sum = carry;
            if (revL1 != null) {
                sum += revL1.val;
                revL1 = revL1.next;
            }
            if (revL2 != null) {
                sum += revL2.val;
                revL2 = revL2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return reverseList(dummyHead.next);
    }
}
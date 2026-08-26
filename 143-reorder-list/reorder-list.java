class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null; 
        ListNode prev = null;
        ListNode curr = head2;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        head2 = prev;
        ListNode first = head;
        while (head2 != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = head2.next;
            first.next = head2; 
            head2.next = temp1; 
            first = temp1;
            head2 = temp2;
        }
  
    }
}
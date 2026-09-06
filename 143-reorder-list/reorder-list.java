class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        //Find The Middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        //Detach The Two LL
        slow.next = null;
        //Reverse The Second List
        ListNode curr = head2;
        ListNode prev= null;
        ListNode fwd = head2;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        //Insert Nodes Of Second List Into the First List
        ListNode t1 = head;
        ListNode t2 = prev;
        while(t2!=null){
         ListNode m1 = t1.next;
         ListNode m2 = t2.next;
         t1.next = t2;
         t2.next = m1;
         t1 = m1;
         t2 = m2; 
        }

    }
}
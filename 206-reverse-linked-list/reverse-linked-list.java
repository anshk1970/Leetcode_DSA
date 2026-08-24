
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = head;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
         return prev;


        // if (head == null || head.next == null) {
        //     return head;
        // }
        //RECURSION
        // ListNode newHead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newHead;
    }
}
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode tempOdd = odd;
        ListNode tempEven = even;
        ListNode temp = head;
        while(temp!=null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;
            tempEven.next = temp;
            if(temp!=null) temp = temp.next;
            tempEven = tempEven.next;
        }
        tempOdd.next = even.next;
        return odd.next;
    }
}
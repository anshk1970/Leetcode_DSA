class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
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
    }
       public boolean isPalindrome(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
         while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         }
         ListNode head2 = slow.next;
         slow.next= null;
         head2 = reverseList(head2);
         ListNode i = head;
         ListNode j = head2;
         while(j!=null){
            if(i.val!=j.val) return false;
            i = i.next;
            j = j.next;
         }
         return true;
       }
    
    
    // public boolean isPalindrome(ListNode head) {
    //     ListNode temp = head;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp.val);
    //         temp = temp.next;
    //     }
    //     int i = 0, j = arr.size()-1;
    //     while(i<j){
    //         int a = arr.get(i), b = arr.get(j);
    //         if(a!=b) return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}
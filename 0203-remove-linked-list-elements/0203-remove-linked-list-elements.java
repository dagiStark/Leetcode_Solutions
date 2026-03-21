class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy = head;
        
        
        if(dummy == null) return head;
        if(dummy.val == val) return removeElements(dummy.next, val);
        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next; // remove node
            } else {
                dummy = dummy.next; // move forward
            }
        }
        
        return head;
    }
}
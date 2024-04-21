/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }
        if(fast != null) slow = slow.next;
        
        ListNode reversed = reverse(slow);
        while(reversed != null){
          if(head.val != reversed.val) return false;
          head = head.next;
          reversed = reversed.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode slow){
      ListNode pre = null;
      ListNode curr = slow;
      while(curr != null){
        ListNode next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
      }
      return pre;
    }
}
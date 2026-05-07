/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // No need to reverse
        if (head == null || left == right) {
            return head;
        }

        // Dummy node helps handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 1: Move prev to node before 'left'
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        /*
            prev -> node before reversal
            curr -> first node of reversal
        */
        ListNode curr = prev.next;

        // Step 2: Reverse nodes between left and right
        for (int i = 0; i < right - left; i++) {

            ListNode temp = curr.next;

            // Remove temp from its current position
            curr.next = temp.next;

            // Insert temp right after prev
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
    }
}
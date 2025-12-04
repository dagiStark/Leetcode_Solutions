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
       Stack<Integer> stack = new Stack<>();
       Queue<Integer> queue = new LinkedList<>();

       ListNode curr = head;
       while(curr != null){
        stack.push(curr.val);
        curr = curr.next;
       }
       ListNode currQ = head;
       while(currQ != null){
        queue.add(currQ.val);
        currQ = currQ.next;
       }
       while(!stack.isEmpty() && !queue.isEmpty()){
        if(stack.pop() != queue.remove()){
            return false;
        }
       }

       return stack.isEmpty() && queue.isEmpty();
    }
}
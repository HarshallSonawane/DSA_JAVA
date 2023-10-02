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
   public ListNode middleNode(ListNode head) {
        
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;           
       }
       return slow;
   }
}

// ListNode node_count = head;
        // int count = 0;
        // while (node_count != null) {
        //     node_count = node_count.next;
        //     count++;
        // }
        // ListNode current = head;
        // for (int i = 0; i < count / 2; i++) {
        //     current = current.next;
        // }
        // return current;
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
    public ListNode swapPairs(ListNode head) {
        
        ListNode temp = head;
        if(temp!=null && temp.next!=null){
            int swap = temp.val;
            temp.val = temp.next.val;
            temp.next.val = swap;
            
            swapPairs(head.next.next);
        }
        return head;
    }
}
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
        
        if(head==null || head.next==null){
            return true;
        }
        
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midEle = slow.next;
        
        ListNode first = head;
        ListNode second = ReverseList(midEle);
        
        while(first!=null && second!=null){
            if(first.val!=second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    
    public ListNode ReverseList(ListNode temp){
        
        ListNode curr = temp;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
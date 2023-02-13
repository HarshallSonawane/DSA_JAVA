/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      
        /*
        ListNode pt = head;
        ListNode prev = head;
        
        while(ptr!=null){
            
            if(ptr.next!=node){
                ptr = ptr.next;    
            }
            if(ptr.next==node){
                prev = ptr.next;
                ptr = prev.next
            }
            
            
        }
        */
        
        node.val = (node.next).val;
        node.next = node.next.next;
        
    }
}
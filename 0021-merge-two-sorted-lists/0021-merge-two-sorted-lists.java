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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode();
        ListNode ptr = result;

        while(true){

            if(list1 == null){
                ptr.next = list2;
                break;
            }
            
            if(list2 == null){
                ptr.next = list1;
                break;
            }

            else if(list1.val<list2.val){
                ptr = ptr.next = list1;
                list1 = list1.next;
            }else{
                ptr = ptr.next = list2;
                list2 = list2.next;
            }
        }
        return result.next;
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode result = head;
        
        while(head !=null){
            if(getNext(head) > Integer.MIN_VALUE) head = head.next;
            else break;
        }
        
        
        return result;
        
    }
    
    private int getNext(ListNode head){
        if(head.next != null && head.val == head.next.val){
                if(head.next != null && head.next.next != null){
                    head.next = head.next.next;
                } else {
                    head.next = null;
                }
            }
        if(head.next != null && head.val == head.next.val) {
            getNext(head);
        }
        if(head.next == null){
            return Integer.MIN_VALUE;
        } 
        else return head.next.val;
    }
}
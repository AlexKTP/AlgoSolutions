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
        
        if(list1 == null) return list2 == null ? null: list2;
        if(list2 == null) return list1 == null ? null : list1;
        
        ListNode result = new ListNode();
        
        merge(result, list1, list2);
        
        return result;
        
    }
    
    private void merge(ListNode result, ListNode list1, ListNode list2){
        if(list1 == null && list2 !=null){
            result.val = list2.val;
            if(list2.next != null) result.next = list2.next;
        } 
        else if (list2 == null && list1 != null) {
            result.val = list1.val;
            if(list1.next != null) result.next = list1.next;
        }
        else if(list1 != null && list2 != null){
            if(list1.val < list2.val ) {
            result.val = list1.val;
            result.next = new ListNode();
            merge(result.next, list1.next, list2);
        } else if(list1.val>list2.val){
            result.val = list2.val;
            result.next = new ListNode();
            merge(result.next, list1, list2.next);
        } else if(list1.val == list2.val){
                result.val = list1.val;
                result.next = new ListNode();
                merge(result.next, list1.next, list2);
        }
        }
    }
}
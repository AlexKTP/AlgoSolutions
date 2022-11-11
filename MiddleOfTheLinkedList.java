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
        
        int length = 0;
        
        int i = 0;
        List<ListNode> list = new ArrayList();
        
        list.add(head);

        while (head.next != null ){
            head = head.next;
            length++;
            list.add(head);
        }
        
    
        
        int middle = Math.round(length/2);
        
        if(length % 2 != 0) middle++;
        

        return list.get(middle);
        
    }
}
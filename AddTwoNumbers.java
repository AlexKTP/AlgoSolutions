import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   StringBuilder sb = new StringBuilder();
        while (l1 != null){
            sb.append(l1.val);
            l1 = l1.next;
        }


        String first = null;
        if(sb.toString().length()>0){

            first = sb.reverse().toString();
        }


        sb = new StringBuilder();
        while (l2 != null){
            sb.append(l2.val);
            l2 = l2.next;
        }


        String second;
        second = sb.reverse().toString();



        BigInteger one = new BigInteger(first);
        BigInteger two = new BigInteger(second);
        String result = new StringBuilder(String.valueOf(one.add(two))).reverse().toString();

        int length = result.length();

        ListNode r = new ListNode();
        ListNode rbis = r;
        for (int i = 0; i < result.length(); i++) {
            if(i>0 && r.next != null) r = r.next;
            r.val = Integer.parseInt(String.valueOf(result.toCharArray()[i]));
            if (i < length - 1) {
                r.next = new ListNode(0);
            }

        }

        return rbis;
    }
}
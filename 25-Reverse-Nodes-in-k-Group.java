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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(true){
            ListNode checker = curr;
            int count = 0;
             while(count<k && checker!=null){
                count++;
                checker = checker.next;
             }

             if(count<k){
                break;
             }
            ListNode last = prev;
            ListNode newEnd = curr;
            for(int i=0;i<k;i++){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;

            if(curr == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
}
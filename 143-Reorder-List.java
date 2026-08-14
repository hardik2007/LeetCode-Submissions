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
    public ListNode mid(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f!=null && f.next!= null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = mid(head);
        ListNode secondhalf = mid.next;
        mid.next = null;

        ListNode hs = reverse(secondhalf);
        ListNode hf = head;

         while(hf!=null &&  hs!=null){
            ListNode temp1 = hf.next;
            ListNode temp2 = hs.next;

            hf.next = hs;
            hs.next = temp1;

            hf = temp1;
            hs = temp2;
            hf = temp1;
    }
}
}
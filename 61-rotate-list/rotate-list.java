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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        int length =1;
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }
        curr.next = head;
        k = k%length;
        int required = length-k;
        ListNode newTail = head;
        while(required-->1){
            newTail = newTail.next;
        }
        ListNode newhead = newTail.next;
        newTail.next = null;
        return newhead;
    }
}
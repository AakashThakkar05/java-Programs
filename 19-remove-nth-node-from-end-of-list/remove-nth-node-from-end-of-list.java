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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy,second = dummy;
        int i = 0;
        while(i < n){
            second = second.next;
            i++;
        } 
        while(second.next != null){
            first = first.next;
            second = second.next; 
        } 
        first.next = first.next.next;
        return dummy.next;
    }
}
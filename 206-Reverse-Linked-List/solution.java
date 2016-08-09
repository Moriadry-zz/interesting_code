/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        // if(head.next != null) {
        //     int temp = head.val;
        //     head.val = head.next.val;
        //     head.next = new ListNode(temp);
        //     return reverseList(head.next);
        // }
        // return head;
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
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
        if(head.next != null) {
            head.next = new ListNode(head.val);
            return reverseList(head.next);
        }
        return head;
    }
}
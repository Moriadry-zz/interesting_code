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
        if(head==null){
            return null;
        }
        if(head.next != null) {
            int temp = head.val;
            head.val = head.next.val;
            head.next = new ListNode(temp);
            return reverseList(head.next);
        }
        return head;
    }
}

1 2 3 4
2 1 3 4
package DeleteNodeInALinkedList;

/**
 * Created by dingpeng on 16/6/1.
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // replace the node as the next, which is very smart :) however, it's bloody slow.
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

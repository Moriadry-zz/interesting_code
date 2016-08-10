public class Solution {
    
    ListNode head;

    /** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode cur = head;
        int count=1;
        int ret = cur.val;
        while (cur.next != null) {
            cur=cur.next;
            double chance = (double) 1 / (double) (count+1);
            double rand = Math.random();
            count++;
            if ( rand <= chance) ret = cur.val;
        }
        return ret;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
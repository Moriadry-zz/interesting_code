package IntegerBreak;

/**
 * Created by dingpeng on 16/8/9.
 */
public class Solution {
    public static int integerBreak(int n) {
        //0 -> 10, Ring queue
        int[] queue = new int[]{0, 0, 1, 2, 4, 6, 9, 12, 18, 27, 36};
        if (n <= 10) return queue[n];
        int curPos = 0; //next write pos

        int cur = 0;
        for (int i = 11; i <= n; i++) {
            cur = Math.max(Math.max(queue[(i - 2) % 11] * 2, queue[(i - 3) % 11] * 3), queue[(i - 4) % 11] * 4);
            queue[curPos] = cur;
            curPos = (curPos + 1) % 11;
        }

        return cur;
    }
}

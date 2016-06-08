package NumberOf1Bits;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n = n >>> 1;
        }
        return sum;
    }
}

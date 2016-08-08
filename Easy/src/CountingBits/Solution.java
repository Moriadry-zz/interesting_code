package CountingBits;

/**
 * Created by dingpeng on 16/8/9.
 */
public class Solution {

    // O(n)!!
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i=0; i<=num; i++) {
            result[i] = hammingWeight(i);
        }
        return result;
    }
    private int hammingWeight(int n) {
        int sum = 0;
        while(n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n = n >>> 1;
        }
        return sum;
    }
}

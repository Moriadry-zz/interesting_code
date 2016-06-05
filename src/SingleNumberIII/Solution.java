package SingleNumberIII;

/**
 * Created by dingpeng on 16/6/5.
 */
public class Solution {

    //bit manipulation solution
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // pick one bit as flag
        int bitFlag = (diff & (~ (diff - 1)));
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & bitFlag) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}

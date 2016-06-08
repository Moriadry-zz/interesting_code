package SingleNumberII;

/**
 * Created by dingpeng on 16/6/8.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int dest=nums[0];
        for(int i=0; i<nums.length; i++){
            dest=(int)(~((~dest)&(~nums[i])));
        }
        return dest;
    }
}

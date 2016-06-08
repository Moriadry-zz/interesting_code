package ProductOfArrayExceptSelf;

/**
 * Created by dingpeng on 16/6/8.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newnums = new int[nums.length];
        int parti=1;
        for(int i=0; i<nums.length; i++){
            parti *= nums[i];
        }

        for(int i=0; i<nums.length; i++){
            newnums[i]=parti/nums[i];
        }
        return newnums;
    }
}

package MajorityElement;

import java.util.Arrays;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i =nums.length;
        if(i%2>1){
            return nums[(i-1)/2];
        } else {
            return nums[i/2];
        }
    }
}

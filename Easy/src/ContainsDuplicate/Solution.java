package ContainsDuplicate;

import java.util.Arrays;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {

    //6ms
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}


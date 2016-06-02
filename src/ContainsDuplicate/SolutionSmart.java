package ContainsDuplicate;

/**
 * Created by dingpeng on 16/6/2.
 */

// this is very fast, much faster then sort method.
// 5ms
public class SolutionSmart {
    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        int[] temp = new int[max - min + 1];
        for (int i : nums) {
            if (temp[i - min] != 0)
                return true;
            else
                temp[i - min] = 1;
        }

        return false;
    }
}

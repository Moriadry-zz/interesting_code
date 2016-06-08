package MissingNumber;

/**
 * Created by dingpeng on 16/6/3.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int m=0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return (nums.length )*(nums.length+1) /2 - sum;
    }
}

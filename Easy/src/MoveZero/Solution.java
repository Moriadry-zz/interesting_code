package MoveZero;

/**
 * Created by dingpeng on 16/6/1.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            } else{
                nums[i-count]=nums[i];
            }
        }
        while (count> 0) {
            nums[nums.length-count] = 0;
            count--;
        }
    }
}

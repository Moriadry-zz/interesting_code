package SingleNumber;

/**
 * Created by dingpeng on 16/6/7.
 */
public class Solution {

    //perfect solution
    public int  singleNumber(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
//            res=(int)((res|~nums[i]) & (~res|nums[i]));
            res=(int) ~(res^nums[i]);
        //(a or !b) and (!a or b) 1 for same; 0 for  different
        return res;
    }
}

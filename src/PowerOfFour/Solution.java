package PowerOfFour;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {

    // 0x555555555555, as: 1010101010101010101010101010101
    public boolean isPowerOfFour(int num) {
        if(num==0) return true;
        if(num<0) return false;
        return ((num & (num-1))==0) && (((num<<1)&0x55555555)==0);
    }
}

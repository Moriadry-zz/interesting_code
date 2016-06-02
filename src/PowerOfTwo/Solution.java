package PowerOfTwo;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        else
            return (n&(n-1))==0;
    }
}

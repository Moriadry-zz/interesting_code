package PowerOfThree;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {

    //check the biggest num MAX_VALUE;
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int maxPower = (int) Math.pow(3,(int)(Math.log(0x7fffffff)/Math.log(3)));
        return maxPower%n==0;
    }
}

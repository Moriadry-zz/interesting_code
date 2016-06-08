package HappyNumber;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        int d=0;
        while(n>0){
            d+=(n%10)*(n%10);
            n/=10;
        }
        return isHappy(d);
    }
}

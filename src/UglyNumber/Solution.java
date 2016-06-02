package UglyNumber;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public boolean isUgly(int num) {
        if(num==1) return true;
        if(num==0) return false;
        int[] list = new int[]{2,3,5};
        for(int i=0;i<list.length;i++){
            while(num%list[i]==0){
                num=num/list[i];
            }
        }
        return num==1;
    }
}

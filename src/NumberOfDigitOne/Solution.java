package NumberOfDigitOne;

/**
 * Created by dingpeng on 16/6/3.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "12";
        System.out.println(s.indexOf("1")+1);
        System.out.println(s.substring(0));

        System.out.println(new Solution().countDigitOne(2));
    }
    public int countDigitOne(int target) {
        StringBuilder sb = new StringBuilder();
        if(target<=0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        for (int i = 1; i <= target; i++) {
            sb.append(i);
        }
        int count = 0;
        String str = sb.toString();
        while(str.contains("1")){
            count++;
            str.substring(str.indexOf("1")+1);
        }
        return count;
    }
}

package AddDigits;

/**
 * Created by dingpeng on 16/6/1.
 */
public class Solution {
    //why so slow???? 2ms
    public int addDigitsSmart(int num) {
        return (num - 1) % 9 + 1;
    }

    public int addDigitsSilly(int num) {
        if (num == 0)
            return 0;
        int i = num % 9;
        if (i == 0)
            return 9;
        return i;
    }
}

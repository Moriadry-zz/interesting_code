package ExcelSheetColumnNumber;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public int titleToNumber(String s) {
        char[] split = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum = sum + (split[i] - 'A' + 1) * (int) Math.pow(26, (split.length - 1 - i));
        }
        return sum;
    }
}

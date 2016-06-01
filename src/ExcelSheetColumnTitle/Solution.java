package ExcelSheetColumnTitle;

/**
 * Created by dingpeng on 16/6/2.
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder dest = new StringBuilder();
        while (n / 26 > 0) {
            dest.append((char) ((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }

        return dest.reverse().toString();
    }
}

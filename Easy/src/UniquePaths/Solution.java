package UniquePaths;

/**
 * Created by dingpeng on 16/6/7.
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        int loop = m-1;
        if (n < m) loop = n-1;

        int start = m+n-2;
        int cut = loop;
        double answer = 1;

        for (int i = 0; i < loop; i++)
            answer *= ((double)(start--))/(cut--);
        return (int)(answer + 0.5);
    }
}

package IntersectionOfTwoArrays;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingpeng on 16/6/1.
 */
public class Solution {

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int[] b = {5,6};
        System.out.println(new Solution().intersection(a,b)[0]);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        java.util.Arrays.sort(nums1);
        java.util.Arrays.sort(nums2);
        List res = new ArrayList<>();

        int i = 0, j = 0;
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                while (++i != nums1.length && nums1[i] == nums1[i - 1])
                    ;
                while (++j != nums2.length && nums2[j] == nums2[j - 1])
                    ;
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] ans = new int[res.size()];
        for (i = 0; i < ans.length; i++)
            ans[i] = (int) res.get(i);
        return ans;
    }
}

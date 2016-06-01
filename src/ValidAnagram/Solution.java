package ValidAnagram;

import java.util.Arrays;

/**
 * Created by dingpeng on 16/6/1.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        if(s1.length != s2.length)
            return false;
        for(int i=0; i< s1.length; i++){
            if(s1[i]!=s2[i])
                return false;
        }
        return true;
    }
}

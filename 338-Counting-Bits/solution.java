public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i=0; i<=num; i++) {
         result[i] = hammingWeight(i);   
        }
    }
     public int hammingWeight(int n) {
        int sum = 0;
        while(n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n = n >>> 1;
        }
        return sum;
    }
}
public class Solution {
     public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] rows = new int[n];
        int result = matrix[0][0];
        while (k-- > 0) {
            int smallest = Integer.MAX_VALUE;
            int colOfSmallest = 0;
            for (int col = 0; col < n; col++) {
                if (rows[col] == n) { continue; }
                if (matrix[rows[col]][col] <= smallest) {
                    smallest = matrix[rows[col]][col];
                    colOfSmallest = col;
                    result = smallest;
                }
            }
            rows[colOfSmallest]++;
        }
        return result;
    }
}
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int down = matrix.length;
        int index = matrix[0].length;
        int index_ = k/index;
        int down_ = k%index;
        return matrix[index_][down_];
    }
}
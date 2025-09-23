import java.util.*;

class Solution {

    static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int n = matrix.length, m = matrix[0].length;
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = (matrix[i][j] == '1') ? 1 : 0;
            }
        }
        Solution obj = new Solution();
        int maxAr = obj.largestRectangleArea(mat[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] += mat[i - 1][j];
                } else {
                    mat[i][j] = 0;
                }
            }
            int temp = obj.largestRectangleArea(mat[i]);
            maxAr = Math.max(maxAr, temp);
        }
        return maxAr;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            max = Math.max(max, heights[i] * width);
        }
        return max;
    }
}

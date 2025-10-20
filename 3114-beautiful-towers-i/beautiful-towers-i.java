class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long best = 0;

        for (int maxIdx = 0; maxIdx < n; maxIdx++) {
            long res = heights[maxIdx];
            int prev = heights[maxIdx];
            for (int i = maxIdx - 1; i >= 0; i--) {
                prev = Math.min(prev, heights[i]);
                res += prev;
            }
            prev = heights[maxIdx];
            for (int i = maxIdx + 1; i < n; i++) {
                prev = Math.min(prev, heights[i]);
                res += prev;
            }
            best = Math.max(best, res);
        }
        return best;
    }
}

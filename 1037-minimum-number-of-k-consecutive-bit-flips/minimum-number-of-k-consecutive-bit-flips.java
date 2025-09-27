class Solution {
    public int minKBitFlips(int[] arr, int k) {
        int n = arr.length;
        int[] isFlipped = new int[n];
        int flipCount = 0, res = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipCount -= isFlipped[i - k];
            }
            if ((arr[i] + flipCount) % 2 == 0) {
                if (i + k > n) return -1;
                flipCount++;
                isFlipped[i] = 1;
                res++;
            }
        }
        return res;
    }
}

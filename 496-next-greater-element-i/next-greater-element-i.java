class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int j = 0;
            while (j < nums2.length && nums2[j] != num) {
                j++;
            }
            int k = j + 1;
            int nextGreater = -1;
            while (k < nums2.length) {
                if (nums2[k] > num) {
                    nextGreater = nums2[k];
                    break;
                }
                k++;
            }
            res[i] = nextGreater;
        }
        return res;
    }
}

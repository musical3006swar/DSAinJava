class Solution {
    int total = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return total;
    }
    void backtrack(int[] nums, int index, int currentXor) {
        if (index==nums.length) {
            total+=currentXor;
            return;
        }
        backtrack(nums,index + 1,currentXor^nums[index]);
        backtrack(nums,index + 1,currentXor);
    }
}

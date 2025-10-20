class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                nums[i]=Math.max(nums[i-1],nums[i]);
                count++;
            }
        }
        return nums.length-count;
    }
}
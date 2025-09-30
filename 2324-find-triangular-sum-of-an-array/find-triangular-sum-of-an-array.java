class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            nums[i] = (nums[i]+nums[i+1])%10;
        }
        
        int[] temp=Arrays.copyOf(nums,n-1);
        return triangularSum(temp);
        
    }
}
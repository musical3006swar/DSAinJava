class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0,flag=0;
        for(int i=0;i<nums.length;i++){
            
            if(flag==1 && nums[i]==0){
                count++;
            }
            if(flag==1 && nums[i]==1){
                if(count<k)return false;
                count=0;
            }
            if(nums[i]==1)flag=1;
        }
        return true;
    }
}
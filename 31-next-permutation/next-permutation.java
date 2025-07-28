class Solution {
    public void rev(int[] nums,int idx,int imme){
        int l = idx;
        int r = imme;

        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        } 
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int imme=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx!=-1){
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[idx]){
                imme=i;
                break;
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[imme];
        nums[imme]=temp;
        }
       
        
        rev(nums,idx+1,nums.length-1);
    }
}
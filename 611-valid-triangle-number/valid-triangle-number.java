class Solution {
    public int triangleNumber(int[] nums) {
        int count=0,n=nums.length;
        if(nums.length<3)return count;
        Arrays.sort(nums);
        for(int i=2;i<n;i++){
            int left=0,right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}
class Solution {
    public boolean check(int x, int y, int z){
        if(x+y<=z)return false;
        else if(y+z<=x)return false;
        else if(z+x<=y)return false;
        return true;
    }
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        if(n<3)return 0;
        Arrays.sort(nums);
        for(int i=n-3;i>=0;i--){
            int right=i+1,left=i+2;
            if(check(nums[i],nums[left],nums[right])){
                return nums[i]+nums[left]+nums[right];
            }
        }
        return 0;
    }
}
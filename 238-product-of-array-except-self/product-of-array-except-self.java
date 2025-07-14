class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int[] suf= new int[nums.length];
        int[] pre= new int[nums.length];
        suf[0]=1;
        pre[nums.length-1]=1;
        for(int i=0;i<nums.length-1;i++){
            suf[i+1]=suf[i]*nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            pre[i-1]=pre[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=suf[i]*pre[i];
        }
        return res;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int[] res =new int[nums.length];
        pre[0]=1;suf[suf.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i-1]*pre[i-1];
            suf[suf.length-i-1]=nums[nums.length-i]*suf[suf.length-i];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=pre[i]*suf[i];
        }
        return res;
        
    }
}
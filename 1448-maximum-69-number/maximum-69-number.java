class Solution {
    public int maximum69Number (int num) {
        int numCopy=num;
        int n= (int)Math.log10(num)+1;
        int[] nums=new int[n];
        for(int i=n-1;i>=0;i--){
            int temp=numCopy%10;
            numCopy/=10;
            nums[i]=temp;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==6){
                nums[i]=9;
                break;
            }
        }
        int var=0;
        for(int i=0;i<n;i++){
            var=var+nums[i];
            var*=10;
        }
        return var/10;
    }
}
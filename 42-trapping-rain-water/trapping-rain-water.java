class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prSum=new int[n];
        int[] suSum=new int[n];
        prSum[0]=height[0];suSum[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            prSum[i]=Math.max(prSum[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suSum[i]=Math.max(suSum[i+1],height[i]);
        }
        int leftMax=0,rightMax=0,total=0;
        for(int i=0;i<n;i++){
            leftMax=prSum[i];rightMax=suSum[i];
            if(height[i]<leftMax && height[i]<rightMax){
                total+=Math.min(leftMax,rightMax)-height[i];
            }
        }
        return total;
    }
}
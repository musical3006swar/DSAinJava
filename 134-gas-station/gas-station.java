class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int sum=0;
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            sum+=(gas[i]-cost[i]);
            val[i]=sum;
        }
        if(sum<0){
            return -1;
        }
        int minIdx=0;
        int minVal=val[0];
        for(int i=1;i<n;i++){
            if(val[i]<minVal){
                minVal=val[i];
                minIdx=i;
            }
        }
        return (minIdx+1)%n;
        
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
 
        int left=1,right=max,answer=0;
        
        while(left<=right){
            int mid=left + (right-left)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(piles[i]+mid -1)/mid;
            }
            if(sum<=h){
                answer=mid;
                right=mid-1;
            }
            if(sum>h){
                left=mid+1;
            }
        }
    return answer;      
    }
}
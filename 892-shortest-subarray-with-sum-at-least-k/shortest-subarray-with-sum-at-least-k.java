class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        int len=n+1;
        Deque<Integer> dq=new ArrayDeque<>();
        long[] pre= new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        for(int i=0;i<=n;i++){
            while(!dq.isEmpty() && pre[i]-pre[dq.peekFirst()]>=k){
                len=Math.min(len,i-dq.pollFirst());
            }
            while(!dq.isEmpty() && pre[i]<=pre[dq.peekLast()])dq.pollLast();
            dq.addLast(i);
        }
        return len<=n?len:-1;
    }
}
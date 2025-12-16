class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que=new ArrayDeque<>();
        int arr[]=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-1;i++){
            while(!que.isEmpty()&&que.peekFirst()<=i-k){
                que.removeFirst();
            }
            while(!que.isEmpty()&&nums[que.peekLast()]<nums[i]){
                que.removeLast();
            }
            que.addLast(i);

            if(i>=k-1){
                arr[i-k+1]=nums[que.peekFirst()];
            }
        }
        return arr;
        
    }
}
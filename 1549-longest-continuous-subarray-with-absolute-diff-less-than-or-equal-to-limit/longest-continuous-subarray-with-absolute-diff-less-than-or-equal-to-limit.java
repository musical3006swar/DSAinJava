class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int startpos= 0; 
        int bestStart= 0, bestLen = 0;
        for(int i=0;i<n;i++){
            while(!min.isEmpty() && nums[min.peekLast()]>=nums[i]){
                min.pollLast();
            }
            min.addLast(i);
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[i]){
                max.pollLast();
            }
            max.addLast(i);
            while(!min.isEmpty() && !max.isEmpty() && nums[max.peekFirst()]-nums[min.peekFirst()]>limit){
                if(min.peekFirst()==startpos)min.pollFirst();
                if(max.peekFirst()==startpos)max.pollFirst();
                startpos++;

            }
            if(i-startpos+1>bestLen){
                bestLen=i-startpos+1;
                bestStart=startpos;
            }

        }
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int i=bestStart;i<bestStart+bestLen;i++){
        //     arr.add(nums[i]);
        // }
        return bestLen;
    }
}
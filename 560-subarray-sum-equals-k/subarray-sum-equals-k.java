class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int preSum=0;
        int count=0;
        hm.put(0,1);
        for(int ele: nums){
            preSum+=ele;
            if(hm.containsKey(preSum-k)){
                count+=hm.get(preSum-k);
            }
            hm.put(preSum, hm.getOrDefault(preSum, 0) + 1);

        }
        return count;
    }
}
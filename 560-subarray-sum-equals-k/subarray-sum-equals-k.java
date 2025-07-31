class Solution {
    public int subarraySum(int[] n, int k) {
        HashMap<Integer,Integer> x = new HashMap<>();
        int res=0;
        int sum=0;
        x.put(0,1);
        for(int num:n){ 
            sum+=num;
            if(x.containsKey(sum-k)){
                res+=x.get(sum-k);

            }
            int y= x.getOrDefault((sum),0)+1;
            x.put(sum,y);
        }
        return res;
    }
}
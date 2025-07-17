class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        return Math.min(min(cost,0,hs),min(cost,1,hs));
    }
    public int min(int[] cost, int i, HashMap<Integer,Integer> hs){
        if(i>=cost.length){
            return 0;
        }
        if(hs.containsKey(i)){
            return hs.get(i);
        }
        int onePlus=min(cost,i+1,hs);
        int twoPlus=min(cost,i+2,hs);
        int result=cost[i]+Math.min(onePlus,twoPlus);
        hs.put(i,result);
        return result;

    }
}
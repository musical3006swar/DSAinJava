class Solution {
    public int rob(int[] cost) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        return Math.max(min(cost,0,hs),min(cost,1,hs));
    }
    public int min(int[] cost, int i, HashMap<Integer,Integer> hs){
        if(i>=cost.length){
            return 0;
        }
        if(hs.containsKey(i)){
            return hs.get(i);
        }
        int onePlus=min(cost,i+2,hs);
        int twoPlus=min(cost,i+3,hs);
        
        int result=cost[i]+Math.max(onePlus,twoPlus);
        hs.put(i,result);
        return result;

    }
}
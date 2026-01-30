class Solution {
    public int climbStairs(int n){
        return climbStairs(n, new HashMap<>());
    }
    public int climbStairs(int n, HashMap<Integer,Integer> hm){
        if(n==1||n==2){
            hm.put(n,n);
            return n;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int result=climbStairs(n-1, hm)+climbStairs(n-2,hm);
        hm.put(n,result);
        return result;
    }
}
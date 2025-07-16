class Solution {
    public int tribonacci(int n){
        return tribonacci(n,new HashMap<>());
    }
    public int tribonacci(int n, HashMap<Integer,Integer> hsh) {
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        if(hsh.containsKey(n)){
            return hsh.get(n);
        }
        int result= tribonacci(n-1,hsh)+tribonacci(n-2,hsh)+tribonacci(n-3,hsh);
        hsh.put(n,result);
        return result;
    }
}
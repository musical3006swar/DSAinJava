class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] tr=new int[n+1];
        
        for(int[] t: trust){
            tr[t[0]]--;
            tr[t[1]]++;
        }
        for(int i=1;i<tr.length;i++){
            if(tr[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
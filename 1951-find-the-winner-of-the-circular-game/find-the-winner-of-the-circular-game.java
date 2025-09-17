class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> qu=new LinkedList<>();
        for(int i=1;i<=n;i++){
            qu.add(i);
        }
        int count=k;
        while(qu.size()>1){
            if(count>1){
                int temp=qu.remove();
                qu.add(temp);
                count--;
            }else if(count==1){
                count=k;
                qu.remove();
            }
        }
        return qu.remove();
    }
}
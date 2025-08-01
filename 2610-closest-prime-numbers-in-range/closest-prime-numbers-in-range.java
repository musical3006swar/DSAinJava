class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> r=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<2) continue;
            int flag=0;
            for(int j=2;j*j<=i;j++)
            { 
                if(i % j == 0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                r.add(i);
            }
        }
        int ed=Integer.MAX_VALUE;
        int x=-1,y=-1;
        for(int i=1;i<r.size();++i){
            int ld=r.get(i)-r.get(i-1);
            if(ld<ed){
                ed=ld;
                x=r.get(i-1);
                y=r.get(i);
            }
        }
        int[] p = new int[2];
        p[0]=x;
        p[1]=y;
        return p;
    }
}

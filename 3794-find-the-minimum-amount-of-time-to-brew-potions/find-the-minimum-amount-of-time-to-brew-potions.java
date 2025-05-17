class Solution {
    public long minTime(int[] skill, int[] mana) {
        long m= skill.length;
        long n = mana.length;
        long[] varArr=new long[skill.length+1];
        varArr[0]=0;
        long sum=0;
        for(int i=0;i<m;i++){
            sum=sum+skill[i];
            varArr[i+1]=sum;
        }
        long startTime=0;
        for(int i=1;i<n;i++){
            long st=startTime;
            for(int j=1;j<varArr.length;j++){
                startTime=Math.max(startTime,st+(mana[i-1]*varArr[j])-(mana[i]*varArr[j-1]));
                //System.out.println(startTime);
            }
            
        }
        
        return startTime+(varArr[varArr.length-1]*mana[mana.length-1]);
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        boolean tell=true;
        if(n>0){
            while(n>1){
                if(n%4!=0){
                    tell=false;
                    break;
                }
                n/=4;
            }
        }else{
            return false;
        }
        return tell;
    }
}
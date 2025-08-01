class Solution {
    public double myPow(double x, int n) {
        double pow=1.0;
        if(x==1.0){
            return 1.0;
        }
        if(n==0){
            return 1.0;
        }
        long m=n;
        if(m<0){
            x=1/x;
            m=-m;
        }
        while(m>0){
            if(m%2==1){
                pow=pow*x;
            }
            x=x*x;
            m=m/2;
        }
        return pow;
    }
}

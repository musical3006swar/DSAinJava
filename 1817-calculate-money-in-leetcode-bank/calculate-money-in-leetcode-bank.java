class Solution {
    public int totalMoney(int n) {
        int rem=n%7,quo=n/7;
        int sum=0;
        if(quo>0){
            for(int i=0;i<quo;i++){
                sum+=(i*7)+28;
            }
        }
        for(int i=1;i<=rem;i++){
            sum+=(quo+i);
        }
        return sum;
    }
}
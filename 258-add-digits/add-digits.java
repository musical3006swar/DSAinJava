class Solution {
    
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int n=num%10;
            sum=sum+n;
            num=num/10;
        }
        if (sum > 0 && Math.floor(Math.log10(sum))>=1) {
            return addDigits(sum); 
        }
        return sum;
    }
}
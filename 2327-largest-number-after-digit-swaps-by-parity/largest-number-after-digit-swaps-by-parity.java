class Solution {
    public int largestInteger(int num) {
        int n=(int)Math.log10(num)+1;
        int[] arr=new int[n];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=num%10;
            num/=10;
        }
        for(int i=0;i<n-1;i++){
            int max=arr[i];
            int par=max%2;
            int idx=i;
            for(int j=i;j<n;j++){
                if((par==arr[j]%2) && max<arr[j]){
                    max=arr[j];
                    idx=j;
                }
                
            }
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        int numb=0,ten=1;
        for(int i=arr.length-1;i>=0;i--){
            numb+=arr[i]*ten;
            ten*=10;
        }
        return numb;
    }
}
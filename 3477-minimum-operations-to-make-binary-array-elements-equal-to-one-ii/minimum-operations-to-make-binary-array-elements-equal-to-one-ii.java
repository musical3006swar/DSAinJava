class Solution {
    public int minOperations(int[] arr) {
        int n=arr.length,flip=0;
        for(int i=0;i<n;i++){
            if((arr[i]==1 && flip%2==1) || (arr[i]==0 && flip%2==0)) flip++;
        }
        return flip;
    }
}
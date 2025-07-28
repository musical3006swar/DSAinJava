class Solution {
    public void sortColors(int[] arr) {
        int[] freq= new int[3];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            for(int j = 0; j<freq[i]; j++){
                arr[k++] = i;
            }
            
        }
    }
}
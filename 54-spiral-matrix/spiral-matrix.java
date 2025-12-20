class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> arr=new ArrayList<>();
        int m=mat.length,n=mat[0].length;
        int top=0,bottom=m-1,left=0,right=n-1,totalEle=0;
        int i=0,j=0;
        while(totalEle<m*n){
            while(j<=right && totalEle<m*n){
                arr.add(mat[i][j]);
                j++;
                totalEle++;
            }
            top++;
            i++;
            j--;
            while(i<=bottom && totalEle<m*n){
                arr.add(mat[i][j]);
                i++;
                totalEle++;
            }
            right--;
            j--;
            i--;
            while(j>=left && totalEle<m*n){
                arr.add(mat[i][j]);
                j--;
                totalEle++;
            }
            bottom--;
            i--;
            j++;
            while(i>=top && totalEle<m*n){
                arr.add(mat[i][j]);
                i--;
                totalEle++;
            }
            left++;
            j++;
            i++;
        }
        return arr;
    }
}
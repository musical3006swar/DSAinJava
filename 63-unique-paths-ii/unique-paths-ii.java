class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] solGrid = new int[obstacleGrid.length][obstacleGrid[0].length];
        int n = solGrid.length;
        int m = solGrid[0].length;
        for(int i=0;i<m;i++){
            if(obstacleGrid[0][i]!=1){
                solGrid[0][i]=1;
            }else{
                solGrid[0][i]=0;
                break;
            }
        }
        for(int i =0;i<n;i++){
            if(obstacleGrid[i][0]!=1){
                solGrid[i][0]=1;
            }else{
                solGrid[i][0]=0;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacleGrid[i][j]!=1){
                    solGrid[i][j]=solGrid[i-1][j]+solGrid[i][j-1];
                }else{
                    solGrid[i][j]=0;
                }
            }
        }
        return solGrid[n-1][m-1];
    }
}

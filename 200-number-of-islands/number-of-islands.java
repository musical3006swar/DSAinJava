class Pair{
    int col;
    int row;
    public Pair(int col, int row){
        this.col=col;
        this.row=row;
    }
}


class Solution {
    public void numIslands(char[][] grid, int[][] vis, int i, int j, int m, int n){
        vis[i][j]=1;
        Queue<Pair> que= new LinkedList<>();
        que.add(new Pair(i,j));
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        while(!que.isEmpty()){
            int colIdx=que.peek().col;
            int rowIdx=que.peek().row;
            que.poll();
            for(int k=0;k<4;k++){
                    int newColIdx = colIdx + dRow[k];
                    int newRowIdx = rowIdx + dCol[k];
                    if( 
                        newColIdx<m && newColIdx>=0
                        && newRowIdx<n && newRowIdx>=0
                        && grid[newColIdx][newRowIdx]=='1' 
                        && vis[newColIdx][newRowIdx]==0
                        
                        ){
                        que.add(new Pair(newColIdx, newRowIdx));
                        vis[newColIdx][newRowIdx]=1;
                    } 
            }
            
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int numOfIslands=0;
        int[][] vis= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    numOfIslands++;
                    numIslands(grid,vis,i,j,m,n);
                }
            }
        }
        return numOfIslands;
    }
}
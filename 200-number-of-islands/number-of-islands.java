class Solution {
    
    public static void zerodfs(int r, int c,char[][] grid){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]=='0')return;
        grid[r][c]='0';
        zerodfs(r-1,c,grid);
        zerodfs(r+1,c,grid);
        zerodfs(r,c-1,grid);
        zerodfs(r,c+1,grid);
    }
    
    public int numIslands(char[][] grid) {
        int island=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    zerodfs(i,j,grid);
                    island++;
                }
            }
        }
        return island;
    }
}

class Pair{
    int left;
    int right;
    int time;
    public Pair(int left, int right, int time){
        this.left=left;
        this.right=right;
        this.time=time;
    }
}

class Solution {
    public int dfs(int[][] copy, int[][] vis, int[][] grid, int m, int n){
        Queue<Pair> que = new LinkedList<>();
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};
        int currTime=0,fresh=0,timeTaken=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(copy[i][j]==2){
                    que.add(new Pair(i,j,0));
                }else if(copy[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        while(!que.isEmpty()){
            boolean spread = false;        
            Pair p = que.poll();
            for(int k=0;k<4;k++){
                int newLeft = p.left + delRow[k];
                int newRight = p.right + delCol[k];
                currTime = p.time+1;
                if(
                    newLeft >= 0 && newLeft < m &&
                    newRight >= 0 && newRight < n &&
                    copy[newLeft][newRight] == 1 &&
                    vis[newLeft][newRight] == 0 
                ){
                    copy[newLeft][newRight] = 2; 
                    vis[newLeft][newRight] = 1;
                    que.add(new Pair(newLeft, newRight,currTime));   
                    fresh--;
                    spread=true;                     
                }
            }
            
        }
        if(fresh>0)return -1;
        timeTaken=currTime-1;
        return timeTaken;
    }
    public int orangesRotting(int[][] grid) {
        int[][] copy = grid;
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis=new int[m][n];
        return dfs(copy,vis,grid,m,n);
    }
}
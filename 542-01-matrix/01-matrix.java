class Pair{
    int left;
    int right;
    int dist;
    public Pair(int left, int right, int dist){
        this.left=left;
        this.right=right;
        this.dist=dist;
    }
}

class Solution {
    public void bfs(int[][] mat,int[][] res,int[][] vis, int m, int n,Queue<Pair> que){
        int[] delRow = {1,0,-1,0};
        int[] delCol = {0,1,0,-1};
        while(!que.isEmpty()){
            int left = que.peek().left;
            int right = que.peek().right;
            int dist = que.peek().dist;
            que.poll();
            res[left][right] = dist;
            for(int k=0;k<4;k++){
                int nLeft = left + delRow[k];
                int nRight = right + delCol[k];
                if( nLeft>=0 && nRight>=0
                    && nLeft<m && nRight<n
                    && vis[nLeft][nRight]==0 
                ){
                    vis[nLeft][nRight]=1;
                    que.offer(new Pair(nLeft,nRight,dist+1));
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> que= new LinkedList<>();
        int m = mat.length;
        int n= mat[0].length;
        int[][] res = new int[m][n];
        int[][] vis= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && mat[i][j]==0){
                    que.offer(new Pair(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }
        bfs(mat,res,vis,m,n,que);
        
        return res;
    }
}
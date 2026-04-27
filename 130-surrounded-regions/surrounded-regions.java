class Pair{
    int left;
    int right;
    public Pair(int left, int right){
        this.left=left;
        this.right=right;
    }
}

class Solution {
    public void bfs(char[][] res, int[][] vis, Queue<Pair> que){
        int m = res.length;
        int n = res[0].length;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};
        while(!que.isEmpty()){
            Pair curr = que.poll();
            int left = curr.left;
            int right = curr.right;
            for(int k=0;k<4;k++){
                int nLeft = left + delRow[k];
                int nRight = right + delCol[k];
                if( 
                    nLeft>=0 && nRight>=0
                    && nLeft<m && nRight<n
                    && vis[nLeft][nRight]==0
                    && res[nLeft][nRight]=='O'
                ){
                    vis[nLeft][nRight]=1;
                    que.offer(new Pair(nLeft,nRight));
                }
            }
        }
    }
    public void solve(char[][] board) {
        Queue<Pair> que = new LinkedList<>();
        int m = board.length;
        int n = board[0].length;
        int[][] vis = new int[m][n]; 
        char[][] res = board; 
        for(int i=0;i<m;i++){
            if(res[i][0] == 'O'){
                que.offer(new Pair(i,0));
                vis[i][0]=1;
            }
            if(res[i][n-1] == 'O'){
                que.offer(new Pair(i,n-1));
                vis[i][n-1]=1;
            }
        }
        for(int j=0;j<n;j++){
            if(res[0][j] == 'O'){
                que.offer(new Pair(0,j));
                vis[0][j]=1;
            }
            if(res[m-1][j] == 'O'){
                que.offer(new Pair(m-1,j));
                vis[m-1][j]=1;
            }
        }
        bfs(res,vis,que);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && res[i][j]=='O'){
                    res[i][j]='X';
                }
                System.out.print(vis[i][j]+" ");
            }
            System.out.println();
        }
        board=res;
    }
}
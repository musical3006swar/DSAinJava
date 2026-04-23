class Pair{
    int left;
    int right;
    public Pair(int left, int right){
        this.left=left;
        this.right=right;
    }
}

class Solution {
    public int dfs(int[][] copy, int[][] vis, int[][] grid, int m, int n){
        Queue<Pair> queA = new LinkedList<>();
        Queue<Pair> queB = new LinkedList<>();
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};
        int flag = 0, count=0,fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(copy[i][j]==2){
                    queA.add(new Pair(i,j));
                }else if(copy[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        while(!queA.isEmpty() || !queB.isEmpty()){
            boolean spread = false;
            if(flag==0){
                int size = queA.size();
                for(int s=0;s<size;s++){
                    Pair p = queA.poll();

                    for(int k=0;k<4;k++){
                        int newLeft = p.left + delRow[k];
                        int newRight = p.right + delCol[k];
                            if(
                                newLeft >= 0 && newLeft < m &&
                                newRight >= 0 && newRight < n &&
                                copy[newLeft][newRight] == 1 &&
                                vis[newLeft][newRight] == 0 
                            ){
                                copy[newLeft][newRight] = 2; 
                                vis[newLeft][newRight] = 1;
                                queB.add(new Pair(newLeft, newRight));   
                                fresh--;
                                spread=true;                     
                            }
                    }
                }
                if(spread)count++;
                flag=1;

            }else{
                int size = queB.size();
                for(int s=0;s<size;s++){
                    Pair p = queB.poll();

                    for(int k=0;k<4;k++){
                        int newLeft = p.left + delRow[k];
                        int newRight = p.right + delCol[k];
                            if(
                                newLeft >= 0 && newLeft < m &&
                                newRight >= 0 && newRight < n &&
                                copy[newLeft][newRight] == 1 &&
                                vis[newLeft][newRight] == 0 
                            ){
                                copy[newLeft][newRight] = 2; 
                                vis[newLeft][newRight] = 1;
                                queA.add(new Pair(newLeft, newRight));   
                                fresh--;
                                spread=true;                     
                            }
                    }    
                }
                if(spread)count++;
                flag=0;
                
            }
        }
        if(fresh>0)return -1;
        return count;

    }
    public int orangesRotting(int[][] grid) {
        int[][] copy = grid;
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis=new int[m][n];
        return dfs(copy,vis,grid,m,n);
    }
}
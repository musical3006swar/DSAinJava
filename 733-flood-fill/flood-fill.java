class Solution {

    public void dfs(int[][] image, int[][] copy, int sr, int sc, int color, int strCol, int[] dRow, int[] dCol){
        image[sr][sc]=color;
        for(int i=0;i<4;i++){
            int newSr= sr+dRow[i];
            int newSc= sc+dCol[i];
            if(newSr>=0 && newSr<copy.length && newSc>=0 && newSc<copy[0].length &&  copy[newSr][newSc]!=color && image[newSr][newSc]==strCol ){
                dfs(image, copy,newSr,newSc, color, strCol, dRow, dCol);
            }

        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int strCol = image[sr][sc];
        int[][] copy = image;
        int[] dRow={+1,0,-1,0};
        int[] dCol={0,+1,0,-1};
        dfs(image,copy,sr,sc,color,strCol, dRow, dCol);
        return copy;
    }
}
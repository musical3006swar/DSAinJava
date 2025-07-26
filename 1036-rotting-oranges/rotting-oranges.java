class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> rotten=new LinkedList<>();
        int fo=0;
        int time=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==2){
                    rotten.offer(new int[]{r,c,0});
                }else if(grid[r][c]==1){  
                    fo++;
                }
            }
        }
        int[][] dir={{1,0},{-1,0},{0,-1},{0,1}};
        while(!rotten.isEmpty()){
            int[] data=rotten.poll();
            int r=data[0];
            int c=data[1];
            for(int[] d:dir){
                if (r+d[0]>-1 && r+d[0]<grid.length&& c+d[1]>-1&&c+d[1]<grid[0].length&&grid[r+d[0]][c+d[1]]==1){
                    grid[r+d[0]][c+d[1]]=2;
                    fo--;
                    rotten.offer(new int[]{r+d[0],c+d[1],data[2]+1});
                    time=data[2]+1;
                }
            }
        }
        if(fo==0){
            return time;
        }
        return -1;
    }
    
}
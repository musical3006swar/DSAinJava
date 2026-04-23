class Solution {
    public void floodFill(int[][] image, int sr, int sc, int color, int startColour){
        if(sc<0 || sc>image[0].length-1 || sr<0 || sr>image.length-1 || image[sr][sc]!=startColour || color==startColour){
            return;
        }
        image[sr][sc]=color;
        floodFill(image,sr+1,sc,color,startColour);
        floodFill(image,sr-1,sc,color,startColour);
        floodFill(image,sr,sc+1,color,startColour);
        floodFill(image,sr,sc-1,color,startColour);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColour= image[sr][sc];
        floodFill(image,sr,sc,color, startColour);
        return image;
    }
}
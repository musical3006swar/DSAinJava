class Solution {
    public boolean exist(char[][] board, String word) {
        boolean sign=false;
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(find(board,word,i,j,0,m,n))return true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] board, String word, int i, int j, int len, int m, int n){
        if(len==word.length()){
            return true;
        }
        if(i>=m||i<0||j>=n||j<0||word.charAt(len)!=board[i][j]){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='#';
        boolean found= find(board,word,i+1,j,len+1,m,n)||
        find(board,word,i,j+1,len+1,m,n)||
        find(board,word,i,j-1,len+1,m,n)||
        find(board,word,i-1,j,len+1,m,n);

        board[i][j]=temp;
        return found;
    }
}
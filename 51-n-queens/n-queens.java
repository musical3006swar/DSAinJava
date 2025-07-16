class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]='.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        solve(board, result);
        return result;
    }

    static void solve(char[][] board, List<List<String>> result) {
        backtrack(board, 0, result);
    }

    static void backtrack(char[][] board, int row, List<List<String>> result) {
        if(row==board.length) {
            result.add(construct(board));
            return;
        }
        for(int col=0;col<board.length;col++) {
            if(isSafe(board,row,col)) {
                board[row][col]='Q';
                backtrack(board,row+1,result);
                board[row][col]='.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for(int i=row; i>=0;i--) {
            if(board[i][col]=='Q')return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++) {
            if(board[i][j]=='Q')return false;
        }
        return true;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for(char[] row:board) {
            res.add(new String(row));
        }
        return res;
    }
}

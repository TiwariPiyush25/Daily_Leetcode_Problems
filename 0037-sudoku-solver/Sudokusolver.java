class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean isValid(char[][] board,int row,int col,int c){
        // check rows
        for (int j=0;j<board.length;j++){
            if (board[row][j]==c) return false;
        }

        // check columns
        for (int i=0;i<board.length;i++){
            if (board[i][col]==c) return false;
        }

        // check 3X3 grid
        int srow=(row/3)*3;
        int scol=(col/3)*3;

        for (int i=srow;i<srow+3;i++){
            for (int j=scol;j<scol+3;j++){
                if (board[i][j]==c){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean solve(char[][] board){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if (board[i][j]=='.'){
                    for (char c='1';c<='9';c++){
                        if (isValid(board,i,j,c)){
                            board[i][j]=c;
                            if (solve(board)) return true;
                            else board[i][j]='.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }
}

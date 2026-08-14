class Solution {
    public int countBattleships(char[][] board) {
        int counter = 0;

        int m = board.length , n = board[0].length;
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] == 'X') counter++;
                if(i > 0 && board[i][j] == 'X' && board[i-1][j] == 'X') counter--;
                if(j > 0 && board[i][j] == 'X' && board[i][j-1] == 'X') counter--;
            }
        }

        return counter;
    }
}
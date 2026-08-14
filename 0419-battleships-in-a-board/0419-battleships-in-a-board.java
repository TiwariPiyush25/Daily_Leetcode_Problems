class Solution {
    public void dfs(int i,int j,char[][] arr){
        arr[i][j] = '.';

        if(i+1 < arr.length && arr[i+1][j] == 'X') dfs(i+1,j,arr); // down
        if(j+1 < arr[0].length && arr[i][j+1] == 'X') dfs(i,j+1,arr); // right
    }
    public int countBattleships(char[][] board) {
        int counter = 0;

        int m = board.length , n = board[0].length;
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] == 'X'){
                    counter++;
                    dfs(i,j,board);
                }
            }
        }

        return counter;
    }
}
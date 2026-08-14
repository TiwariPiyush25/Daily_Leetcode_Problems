class Solution {
    public void dfs(int i,int j,char[][] arr,boolean[][] vis){
        vis[i][j] = true;

        if(i+1 < arr.length && !vis[i+1][j] && arr[i+1][j] == 'X') dfs(i+1,j,arr,vis); // down
        if(j+1 < arr[0].length && !vis[i][j+1] && arr[i][j+1] == 'X') dfs(i,j+1,arr,vis); // right
    }
    public int countBattleships(char[][] board) {
        int counter = 0;

        int m = board.length , n = board[0].length;
        boolean[][] vis = new boolean[m][n];

        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(!vis[i][j] && board[i][j] == 'X'){
                    counter++;
                    dfs(i,j,board,vis);
                }
            }
        }

        return counter;
    }
}
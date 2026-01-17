class Solution {
    public void dfs(int i,int j,boolean[][] vis,char[][] board,int[] row,int[] col){
        int m = board.length;
        int n = board[0].length;
        vis[i][j] = true;

        // Check for Up, Left, Down, Right
        for(int k=0;k<4;k++){
            int newRow = row[k] + i;
            int newCol = col[k] + j;
            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !vis[newRow][newCol] && board[newRow][newCol] == 'O'){
                dfs(newRow,newCol,vis,board,row,col);
            }
        }

        
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] vis = new boolean[m][n];
        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        // traverse on the boundary
        // traverse on first & last row
        for(int j = 0;j<n;j++){
            // 1st row
            if(!vis[0][j] && board[0][j] == 'O'){
                dfs(0,j,vis,board,row,col);

            }

            // last row
            if(!vis[m-1][j] && board[m-1][j] == 'O'){
                dfs(m-1,j,vis,board,row,col);
            }
        }

        // traverse on first & last col
        for(int i = 0;i<m;i++){
            // 1st col
            if(!vis[i][0] && board[i][0] == 'O'){
                dfs(i,0,vis,board,row,col);

            }

            // last col
            if(!vis[i][n-1] && board[i][n-1] == 'O'){
                dfs(i,n-1,vis,board,row,col);
            }
        }

        // convert O's
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j] = 'X';
                }
            }
        }


    }
}
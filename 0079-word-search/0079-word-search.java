class Solution {
    public boolean flag;
    public String temp;
    public void find(int r,int c,char[][] board,String word,boolean[][] vis){
        int m = board.length , n = board[0].length;
        if(word.length()==1 && board[r][c] == word.charAt(0)){
            flag = true;
            return;
        }

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};
        word = word.substring(1);
        for(int i=0;i<4;i++){
            int newRow = r + row[i];
            int newCol = c + col[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !vis[newRow][newCol] && board[newRow][newCol] == word.charAt(0)){
                vis[newRow][newCol] = true;
                find(newRow,newCol,board,word,vis);
                vis[newRow][newCol] = false;
            }
        }

    }
    public boolean exist(char[][] board, String word) {
        temp = word;
        int m = board.length , n = board[0].length;
        flag = false;

        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j] == word.charAt(0)){
                    vis[i][j] = true;
                    find(i,j,board,word,vis);
                    word = temp;
                    vis[i][j] = false;
                }
            }
        }

        return flag;
    }
}
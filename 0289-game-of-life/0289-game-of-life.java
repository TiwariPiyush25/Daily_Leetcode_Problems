class Solution {
    public boolean Possible2Live(int[][] arr,int i,int j){
        int m = arr.length, n = arr[0].length;
        int[] row = {-1,-1,-1,0,0,1,1,1};
        int[] col = {-1,0,1,-1,+1,-1,0,1};

        int cntlive = 0;
        for(int k=0;k<8;k++){
            int newrow = i + row[k];
            int newcol = j + col[k];

            if(newrow >= 0 && newrow<m && newcol>=0 && newcol<n && arr[newrow][newcol] == 1){
                cntlive++;
            }
        }

        if(arr[i][j] == 1 && (cntlive==2 || cntlive==3)) return true;
        if(arr[i][j] == 0 && cntlive==3) return true;

        return false;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        int[][] copy = new int[m][];
        for (int i = 0; i < m; i++) {
            copy[i] = Arrays.copyOf(board[i], n);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(Possible2Live(copy,i,j)){
                    board[i][j] = 1;
                }
                else {
                    board[i][j] = 0;
                }
            }
        }


    }
}
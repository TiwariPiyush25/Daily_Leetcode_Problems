class Solution {
    public int numRookCaptures(char[][] board) {
        int rook[] = {-1,-1};
        // find rook
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    rook[0] = i;
                    rook[1] = j;

                    break;
                }
            }
        }

        int cnt = 0;
        int r = rook[0], c = rook[1];
        // check left
        for(int j=c-1;j>=0;j--){
            if(board[r][j] == 'B') break;
            if(board[r][j] == 'p'){
                cnt++;
                break;
            }
        }

        // check right
        for(int j=c+1;j<8;j++){
            if(board[r][j] == 'B') break;
            if(board[r][j] == 'p'){
                cnt++;
                break;
            }
        }

        // check Up
        for(int i=r-1;i>=0;i--){
            if(board[i][c] == 'B') break;
            if(board[i][c] == 'p'){
                cnt++;
                break;
            }
        }

        // check down
        for(int i=r+1;i<8;i++){
            if(board[i][c] == 'B') break;
            if(board[i][c] == 'p'){
                cnt++;
                break;
            }
        }

        return cnt;
    }
}
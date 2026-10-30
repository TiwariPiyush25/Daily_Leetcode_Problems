class Solution {
    public String tictactoe(int[][] moves) {
        int[][] arr = new int[3][3];
        for(int[] a : arr){
            Arrays.fill(a,-1);
        }

        int x = 0;
        for(int[] move : moves){
            int r = move[0], c = move[1];
            arr[r][c] = x;
            x = 1 - x;
        }

        // check every column
        for(int j = 0;j < 3;j++){
            int cnt = 1;
            for(int i = 1;i < 3;i++){
                if(arr[i][j] == arr[0][j]){
                    cnt++;
                }
            }

            if(cnt == 3){
                if(arr[0][j] == 0) return "A";
                else if(arr[0][j] == 1) return "B";
            }
        }

        // check every row
        for(int i = 0;i < 3;i++){
            int cnt = 1;
            for(int j = 1;j < 3;j++){
                if(arr[i][j] == arr[i][0]){
                    cnt++;
                }
            }

            if(cnt == 3){
                if(arr[i][0] == 0) return "A";
                else if(arr[i][0] == 1) return "B";
            }
        }

        // check diagonals
        int cnt = 1;
        for(int i = 1;i < 3;i++){
            if(arr[i][i] == arr[0][0]) cnt++;
        }

        if(cnt == 3){
            if(arr[0][0] == 0) return "A";
            else if(arr[0][0] == 1) return "B";
        }

        cnt = 1;
        int j = 1;
        for(int i = 1;i < 3;i++){
            if(arr[i][j--] == arr[0][2]) cnt++;
        }

        if(cnt == 3){
            if(arr[0][2] == 0) return "A";
            else if(arr[0][2] == 1) return "B";
        }

        for(int[] a : arr){
            for(int i = 0;i < 3;i++) {
                if(a[i] == -1) return "Pending";
            }
        }
        return "Draw"; 
    }
}
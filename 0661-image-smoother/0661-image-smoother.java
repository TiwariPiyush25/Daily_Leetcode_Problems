class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];
        int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        for(int i = 0;i < m; i++){
            for(int j = 0;j < n; j++){
                int sum = 0;
                int cnt = 0;
                for(int k=0;k<8;k++){
                    int newRow = i + dir[k][0];
                    int newCol = j + dir[k][1];

                    if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n){
                        sum += img[newRow][newCol];
                        cnt++;
                    }
                }
                sum  += img[i][j];
                cnt++;

                int avg = sum / cnt;
                ans[i][j] = avg;
            }
        }

        return ans;
    }
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;

        // traverse on row 0
        for(int j = 0;j < n;j++){
            int r = 0, c = j;
            int prev = matrix[r][c];

            while(r < m && c < n){
                if(matrix[r][c] != prev) return false;
                r++;
                c++;
            }
        }

        // traverse on col 0
        for(int i = 0;i < m;i++){
            int r = i, c = 0;
            int prev = matrix[r][c];

            while(r < m && c < n){
                if(matrix[r][c] != prev) return false;
                r++;
                c++;
            }
        }
        return true;
    }
}
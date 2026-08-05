class Solution {
    public boolean isSpecial(int[][] mat,int i,int j){
        int m = mat.length, n = mat[0].length;

        // check row
        for(int k = 0;k < n;k++){
            if(k != j && mat[i][k] == 1) return false;
        }

        // check col
        for(int k = 0;k < m;k++){
            if(k != i && mat[k][j] == 1) return false;
        }

        return true;
    }
    public int numSpecial(int[][] mat) {
        int count = 0;

        int m = mat.length, n = mat[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(mat[i][j] == 1 && isSpecial(mat,i,j)){
                    count++;
                }
            }
        }

        return count;
    }
}
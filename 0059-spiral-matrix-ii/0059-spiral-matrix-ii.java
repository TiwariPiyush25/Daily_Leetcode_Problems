class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        
        int a=1;

        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=n-1;
        while(a<=n*n){
            for(int j=sc;j<=ec;j++){
                matrix[sr][j]=a++;
            }
            sr++;

            if(a>n*n) break;
            for(int i=sr;i<=er;i++){
                matrix[i][ec]=a++;
            }
            ec--;

            if(a>n*n) break;
            for(int j=ec;j>=sc;j--){
                matrix[er][j]=a++;
            }
            er--;

             if(a>n*n) break;
            for(int i=er;i>=sr;i--){
                matrix[i][sc]=a++;
            }
            sc++;
        }

        return matrix;
    }
}
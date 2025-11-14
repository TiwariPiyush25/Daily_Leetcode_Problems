class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];

        for(int[] arr:queries){
            int sr = arr[0] , sc = arr[1];
            int er = arr[2] , ec = arr[3];

            for(int i=sr;i<=er;i++){
                for(int j=sc;j<=ec;j++){
                    mat[i][j]+=1;
                }
            }
        }


        return mat;
    }
}
class Solution {
     public static void reverse(int[] arr){
        int n=arr.length;
        for (int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void transpose(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public static boolean isSame(int[][] A,int[][] B){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i][j] != B[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            rotate(mat);

            if(isSame(mat,target)) return true;
        }
        return false;
    }
}
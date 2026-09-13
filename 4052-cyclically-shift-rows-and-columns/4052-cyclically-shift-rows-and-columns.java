class Solution {
    public void reverse(int[] arr,int i,int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public void rotate(int[] arr,int k){
        int n = arr.length;
        reverse(arr ,0 , k - 1);
        reverse(arr , k,n - 1);
        reverse(arr ,0 ,n - 1);
    }
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i = 0;i < n;i++){
            rotate(grid[i] , rowShift[i]);
        }
        
        for(int j = 0;j < n;j++){
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = grid[i][j];
            }

            rotate(arr , colShift[j]);
            for(int i = 0;i < n;i++){
                grid[i][j] = arr[i];
            }
        }
        return grid;
    }
}
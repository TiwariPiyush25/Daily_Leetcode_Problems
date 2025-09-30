class Solution {
    public boolean ifLucky(int[][] arr,int row,int col){
        int min=arr[row][col];
        for(int i=0;i<arr[0].length;i++){
            if(arr[row][i]<min) return false;
        }

        int max=arr[row][col];
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]>max) return false;
        }

        return true;
    }
    
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ifLucky(matrix,i,j)){
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}
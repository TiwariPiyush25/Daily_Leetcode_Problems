class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m=arr.length , n = arr[0].length;

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(arr[i][j]);
            }
            ans.add(row);
        }

        k=k%(m*n);
        while(k-->0){
            // change the values
            for(int i=0;i<m;i++){
                int temp=arr[i][n-1];
                for(int j=n-1;j>0;j--){
                    ans.get(i).set(j,arr[i][j-1]);
                }
                int row=(i+1)%m;
                int col=(n)%n;

                ans.get(row).set(col,temp);
            }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=ans.get(i).get(j);
                }
            }
        }

        return ans;
    }
}
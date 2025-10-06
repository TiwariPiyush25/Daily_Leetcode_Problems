class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int n=grid.length;
        
        for(int i=0;i<n;i++){
            int st=0;
            int end=grid[0].length-1;
            int idx=grid[0].length;
            while(st<=end){
                int mid=(st+end)/2;

                if(grid[i][mid]<0){
                    idx=mid;
                    end=mid-1;
                }
                else st=mid+1;
            }

            count+=(grid[0].length-idx);
        }

        return count;
    }
}
class Solution {
    public void dfs(int r,int c,int[][] ans,int[][] image,int color,int inicolor,int[] row,int[] col){

        ans[r][c] = color;
        int m = image.length, n = image[0].length;
        for(int i=0;i<4;i++){
            int newRow = r + row[i];
            int newCol = c + col[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && image[newRow][newCol] == inicolor && image[newRow][newCol]!=color){
                dfs(newRow,newCol,ans,image,color,inicolor,row,col);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];

        int[][] ans = Arrays.copyOf(image,image.length);

        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        dfs(sr,sc,ans,image,color,initialcolor,row,col);

        return ans;
    }
}
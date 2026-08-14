class Solution {
    public void bfs(int i,int j,int[][] arr,int[][] vis,List<List<Integer>> ans){
        vis[i][j] = 1;

        int m = arr.length , n = arr[0].length;
        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});

        boolean pacific = false;
        boolean atlantic = false;
        while(!q.isEmpty()){
            int[] top = q.remove();
            int r = top[0], c = top[1];

            if(r == 0 || c == 0) {
                pacific = true;
            }
            if(r == m-1 || c == n-1) {
                atlantic = true;
            }

            if(pacific && atlantic) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i); temp.add(j);
                
                ans.add(temp);
                return;
            }
            
            for(int k = 0;k < 4;k++){
                int nr = r + dir[k][0], nc = c + dir[k][1];

                if(nr >= 0 && nr <= m-1 && nc >= 0 && nc <= n-1 && vis[nr][nc] == 0 && arr[nr][nc] <= arr[r][c]){
                    q.add(new int[]{nr,nc});
                    vis[nr][nc] = 1;
                }
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        
        int m = heights.length , n = heights[0].length;
        int[][] vis = new int[m][n];

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                bfs(i,j,heights,vis,ans);
                for(int[] v :vis) Arrays.fill(v,0);
            }
        }

        return ans;
    }
}   
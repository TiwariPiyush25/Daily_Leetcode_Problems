class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;

        int m = grid.length , n = grid[0].length;
        int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0});

        while(!q.isEmpty()){
            int[] temp = q.remove();
            int r = temp[0], c = temp[1], dist = temp[2];

            if(r == m-1 && c == n-1) {
                return dist+1;
            }

            for(int[] d:dir){
                int newr = r + d[0], newc = c + d[1];

                if(newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 0){
                    grid[newr][newc] = 1;
                    q.add(new int[]{newr,newc,dist+1});
                }
            }
        }


        return -1;
    }
}
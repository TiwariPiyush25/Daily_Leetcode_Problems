class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;

        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{entrance[0],entrance[1],0});

        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};
        boolean[][] vis = new boolean[m][n];
        vis[entrance[0]][entrance[1]] = true;
        while(!Q.isEmpty()){
            int[] temp = Q.remove();
            int r = temp[0], c = temp[1], step = temp[2];

            if((r != entrance[0] || c != entrance[1]) && (r == 0 || c == 0 || r == m-1 || c == n-1)) return step;

            for(int i = 0;i < 4;i++){
                int newr = r + dir[i][0];
                int newc = c + dir[i][1];

                if(newr >= 0 && newr <= m-1 && newc >= 0 && newc <= n-1 && !vis[newr][newc] && maze[newr][newc] == '.'){
                    Q.add(new int[]{newr,newc,step+1});
                    vis[newr][newc] = true;
                }
            }
        }

        return -1;
    }
}
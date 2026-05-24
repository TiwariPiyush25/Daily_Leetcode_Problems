class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        //                    East      south     west        north
        int[][] direction = {{0 , 1} , {1 , 0} , {0 , -1} , {-1 , 0}};
        int steps = 0;
        int dir = 0;

        int idx = 1;
        int[][] ans = new int[rows * cols][2];
        ans[0][0] = rStart;
        ans[0][1] = cStart;

        while(idx < ans.length){
            if(dir == 0 || dir == 2) steps++; // East ya West Movement

            for(int j = 0;j < steps;j++){
                rStart += direction[dir][0]; // x
                cStart += direction[dir][1]; // y

                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    ans[idx][0] = rStart;
                    ans[idx][1] = cStart;
                    idx++;
                }
            }

            dir = (dir + 1) % 4; // direction change
        }
        return ans;
    }
}
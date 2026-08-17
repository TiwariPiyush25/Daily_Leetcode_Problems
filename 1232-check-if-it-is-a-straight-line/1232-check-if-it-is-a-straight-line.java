class Solution {
    public boolean checkStraightLine(int[][] A) {
        int n = A.length;
        for(int i = 2;i < n;i++){
            int x1 = A[i-2][0], x2 = A[i-1][0] , x3 = A[i][0];
            int y1 = A[i-2][1], y2 = A[i-1][1] , y3 = A[i][1];
            
            if((y2-y1)*(x3-x2) != (y3-y2)*(x2-x1)) return false;
        }

        return true;
    }
}
class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] temp = new int[rows*cols][3];

        int k = 0;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                int dist = Math.abs(rCenter - i) + Math.abs(cCenter - j);

                temp[k][0] = i;
                temp[k][1] = j;
                temp[k][2] = dist;

                k++;
            }
        }

        Arrays.sort(temp , (a , b) -> a[2] - b[2]);

        int[][] ans = new int[rows*cols][2];
        for(int i = 0;i < k;i++){
            ans[i][0] = temp[i][0];
            ans[i][1] = temp[i][1];
        }

        return ans;
    }
}
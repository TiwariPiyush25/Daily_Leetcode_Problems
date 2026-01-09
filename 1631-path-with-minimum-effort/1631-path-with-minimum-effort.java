class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;

        Triplet(int r,int c,int e){
            this.row = r;
            this.col = c;
            this.effort = e;
        }

        public int compareTo(Triplet t){
            return this.effort - t.effort;
        }
    }
    public int minimumEffortPath(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] ans = new int[m][n];
        for(int[] a:ans){
            Arrays.fill(a,Integer.MAX_VALUE);
        }

        ans[0][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));
        int[] r = {-1,0,1,0}; // row
        int[] c = {0,-1,0,1}; // col
        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            int row = top.row , col = top.col, effort = top.effort;

            if(row == m-1 && col == n-1) break;
            if(effort > ans[row][col]) continue;

            for(int i = 0;i<=3;i++){
                int newRow = row + r[i];
                int newCol = col + c[i];
                if(newRow <0 || newCol <0 || newRow > m-1 || newCol > n-1) continue;
                int e = Math.abs(arr[newRow][newCol] - arr[row][col]);
                e = Math.max(e,effort);
                if(e < ans[newRow][newCol]){
                    ans[newRow][newCol] = e;
                    pq.add(new Triplet(newRow,newCol,e));
                }
            }
        }

        return ans[m-1][n-1];
    }
}
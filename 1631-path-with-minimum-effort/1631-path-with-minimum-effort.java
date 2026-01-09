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

        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            int row = top.row , col = top.col, effort = top.effort;

            if(row == m-1 && col == n-1) break;
            if(effort > ans[row][col]) continue;
            
            if(row > 0){ // going up row-1
                int e = Math.abs(arr[row-1][col] - arr[row][col]);
                e = Math.max(e,effort);
                if(e < ans[row-1][col]){
                    ans[row-1][col] = e;
                    pq.add(new Triplet(row-1,col,e));
                }
            } 
            if(col > 0){ // going left col-1
                int e = Math.abs(arr[row][col-1] - arr[row][col]);
                e = Math.max(e,effort);
                if(e < ans[row][col-1]){
                    ans[row][col-1] = e;
                    pq.add(new Triplet(row,col-1,e));
                }
            }
            if(row < m-1){ // going down row-1
                int e = Math.abs(arr[row+1][col] - arr[row][col]);
                e = Math.max(e,effort);
                if(e < ans[row+1][col]){
                    ans[row+1][col] = e;
                    pq.add(new Triplet(row+1,col,e));
                }
            } 
            if(col < n-1){ // going right col-1
                int e = Math.abs(arr[row][col+1] - arr[row][col]);
                e = Math.max(e,effort);
                if(e < ans[row][col+1]){
                    ans[row][col+1] = e;
                    pq.add(new Triplet(row,col+1,e));
                }
            }
        }

        return ans[m-1][n-1];
    }
}
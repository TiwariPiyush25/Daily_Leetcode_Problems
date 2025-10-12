class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int row=0;
        int col=0;

        while(row<matrix.length){
            pq.add(matrix[row][col++]);

            if(col==matrix[0].length){
                col=0;
                row++;
            }
            
            if(pq.size()>k){
                pq.remove();
            }
        }

        return pq.peek();
    }
}
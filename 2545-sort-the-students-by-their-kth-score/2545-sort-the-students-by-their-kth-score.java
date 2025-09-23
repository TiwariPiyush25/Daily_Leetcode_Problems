class pair implements Comparable<pair>{
        int ele;
        int row;

        pair(int e,int r){
            this.ele=e;
            this.row=r;
        }

        public int compareTo(pair p){
            return this.ele-p.ele;
        }
}
    
class Solution {
    public int[][] sortTheStudents(int[][] arr, int k) {
        int n=arr.length;
        int m=arr[0].length;
        PriorityQueue<pair> p = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            p.add(new pair(arr[i][k],i));
        }

        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            pair temp=p.remove();

            int row=temp.row;
            matrix[i]=arr[row];
        }

        return matrix;
    }
}
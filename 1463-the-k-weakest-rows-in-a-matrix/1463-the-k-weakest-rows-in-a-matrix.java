class pair implements Comparable<pair>{
    int row;
    int soldier;

    pair(int r,int s){
        this.row=r;
        this.soldier=s;
    }

    public int compareTo(pair p){
        if(this.soldier==p.soldier) return this.row - p.row;
        return this.soldier - p.soldier; 
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            int st=0;
            int end=mat[0].length-1;
            int idx=mat[0].length;
            while(st<=end){
                int mid=(st+end)/2;

                if(mat[i][mid]<=0){
                    idx=mid;
                    end=mid-1;
                }
                else st=mid+1;
            }

            pq.add(new pair(i,idx));
            if(pq.size()>k) pq.remove();
        }

        int[] ans=new int[k];
        int i=k-1;
        while(!pq.isEmpty()){
            pair p = pq.remove();
            ans[i--] = p.row;
        }

        return ans;
    }
}
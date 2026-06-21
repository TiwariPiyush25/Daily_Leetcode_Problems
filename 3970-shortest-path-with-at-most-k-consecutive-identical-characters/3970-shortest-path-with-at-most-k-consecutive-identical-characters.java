class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
    
        for(int[] edge : edges){
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new int[]{v,w});
        }



        int[][] cost = new int[n][k+1];
        for(int[] c:cost){
            Arrays.fill(c,Integer.MAX_VALUE);
        }

        int s = labels.charAt(0) - 'a';
        cost[0][1] = 0;

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        minheap.add(new int[]{0,0,s,1});

        while(!minheap.isEmpty()){
            int[] temp = minheap.remove();
            
            if(cost[temp[0]][temp[3]] < temp[1]) continue;
            
            for(int[] arr : adj.get(temp[0])){
                int dist = temp[1] + arr[1];
                int cnt = temp[3];
                int pos = (int) labels.charAt(arr[0]) - 'a';
                if(cnt == k && pos == temp[2]) continue;
                else if(cnt < k && pos == temp[2]){
                    cnt++;
                }
                else {
                    cnt = 1;
                }

                if(dist < cost[arr[0]][cnt]){
                    minheap.add(new int[]{arr[0],dist,pos,cnt});
                    cost[arr[0]][cnt] = dist;
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        
        for(int cnt = 0;cnt <= k;cnt++){
            ans = Math.min(ans,cost[n-1][cnt]);
        }
        

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
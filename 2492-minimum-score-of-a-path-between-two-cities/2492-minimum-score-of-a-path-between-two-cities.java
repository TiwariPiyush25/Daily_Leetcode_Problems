class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();

        for(int i = 0;i<=n;i++) adj.add(new ArrayList<>());
        for(int[] road : roads){
            int a = road[0] , b = road[1],dist = road[2];
             
            adj.get(a).add(new int[]{b,dist});
            adj.get(b).add(new int[]{a,dist});
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,Integer.MAX_VALUE});
        boolean[] vis = new boolean[n+1];

        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int[] top = q.remove();
            int u = top[0] , c = top[1];

            for(int[] x : adj.get(u)){
                int CurrCost = Math.min(x[1],c);

                min = Math.min(CurrCost , min);
                if(!vis[x[0]]) {
                    vis[x[0]] = true;
                    q.add(new int[]{x[0],CurrCost});
                }
            }
        }

        return min;
    }
}
class Solution {
    public int find(int a,int[] parent){
        if(parent[a]==a) return a;

        return find(parent[a],parent); // check leader of parent of a..
    }
    public void union(int a,int b,int[] parent){
        int leaderA = find(a,parent);
        int leaderB = find(b,parent);
        
        if(leaderA != leaderB) {
            parent[leaderB] = leaderA;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        int[] parent = new int[n+1]; // 1 to n nodes
        parent[0] = Integer.MIN_VALUE; // does not exist node

        for(int i = 1;i<=n;i++) parent[i] = i;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) continue;
                // edge is from i+1 to j+1
                if(isConnected[i][j]==1) union(i+1,j+1,parent); // connecting group leaders of i+1 & j+1
            }
        }


        int ConnectedComponents = 0;
        for(int i=1;i<=n;i++){
            if(parent[i] == i) ConnectedComponents++;
        }

        return ConnectedComponents;
    }
}
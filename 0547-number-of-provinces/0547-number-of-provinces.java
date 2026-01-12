class Solution {
    public int find(int a,int[] parent){
        if(parent[a]==a) return a;

        return find(parent[a],parent); // check leader of parent of a..
    }
    public void union(int a,int b,int[] parent,int[] size){
        a = find(a,parent);
        b = find(b,parent);
        
        if(a != b) {
            if(size[a]>size[b]){ // a should b eparent of b
                parent[b] = a;
                size[a] += size[b]; 
            }
            else {
                parent[a] = b;
                size[b] += size[b]; 
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        int[] parent = new int[n+1]; // 1 to n nodes
        int[] size = new int[n+1];
        parent[0] = Integer.MIN_VALUE; // does not exist node

        for(int i = 1;i<=n;i++){
            parent[i] = i;
            size[i] = 1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) continue;
                // edge is from i+1 to j+1
                if(isConnected[i][j]==1) union(i+1,j+1,parent,size); // connecting group leaders of i+1 & j+1
            }
        }


        int ConnectedComponents = 0;
        for(int i=1;i<=n;i++){
            if(parent[i] == i) ConnectedComponents++;
        }

        return ConnectedComponents;
    }
}
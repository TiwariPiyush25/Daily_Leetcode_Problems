class Solution {
public:
    void bfs(int node,vector<vector<int>> &adj,vector<bool> &vis){
        vis[node] = 1;

        queue<int> q;
        q.push(node);

        while(not q.empty()){
            int front = q.front();
            
            for(auto ele : adj[front]){
                if(not vis[ele]){
                    q.push(ele);
                    vis[ele] = 1;
                }
            }
            q.pop();
        }

    }
    vector<int> remainingMethods(int n, int k, vector<vector<int>>& invocations) {
        vector<vector<int>> adj(n);

        for(auto &inv : invocations){
            int u = inv[0] , v = inv[1];

            adj[u].push_back(v);
        }

        vector<bool> suspicious(n);
        bfs(k , adj, suspicious);

        bool flag = 0;
        for(auto &inv : invocations){
            int u = inv[0] , v = inv[1];

            if(not suspicious[u] && suspicious[v]) {
                flag = 1;
                break;
            }
        }

        vector<int> ans;
        for(int i = 0;i < n;i++){
            if(flag) ans.push_back(i);
            else if(not suspicious[i]) ans.push_back(i);
        }

        return ans;
    }
};
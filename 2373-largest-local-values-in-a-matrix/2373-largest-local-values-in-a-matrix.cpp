class Solution {
public:
    int maxValue(vector<vector<int>>& grid,int sr,int sc){
        int mx = INT_MIN;
        for(int i = sr;i < sr + 3;i++){
            for(int j = sc;j < sc + 3;j++){
                mx = max(grid[i][j] , mx);
            }
        }

        return mx;
    }
    vector<vector<int>> largestLocal(vector<vector<int>>& grid) {
        int n = grid.size();

        vector<vector<int>> vec(n-2,vector<int>(n-2));
        for(int i = 0;i < n - 2;i++){
            for(int j = 0;j < n - 2;j++){
                vec[i][j] = maxValue(grid,i,j);
            }
        }

        return vec;
    }
};
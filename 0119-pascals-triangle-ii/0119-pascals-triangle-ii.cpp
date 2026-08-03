class Solution {
public:
    int nCr(int n,int r){
        long long ans = 1;

        int m = min(n-r,r);

        for(int i = 1;i <= m;i++){
            ans *= (n-i+1);
            ans /= i;
        }

        return (int) ans;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> vec(numRows);

        for(int i = 0;i < numRows;i++){
            for(int j = 0; j <= i;j++){
                int val = nCr(i,j);

                vec[i].push_back(val);
            }
        }

        return vec;
    }
    vector<int> getRow(int rowIndex) {
        vector<vector<int>> ans = generate(rowIndex+1);

        return ans[rowIndex];
    }
};
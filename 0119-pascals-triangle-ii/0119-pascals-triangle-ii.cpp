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
    vector<int> getRow(int rowIndex) {
        vector<int> ans;
        for(int j = 0;j <= rowIndex;j++){
            ans.push_back(nCr(rowIndex,j));
        }
        return ans;
    }
};
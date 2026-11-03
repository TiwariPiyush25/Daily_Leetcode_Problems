class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;

        int sr = 0,sc = 0,er = matrix.size()-1,ec = matrix[0].size()-1;

        while(sr <= er && sc <= ec){
            for(int j = sc;j <= ec;j++){
                ans.push_back(matrix[sr][j]);
            }
            sr++;

            if(sr > er || sc > ec) break;
            for(int i = sr;i <= er;i++){
                ans.push_back(matrix[i][ec]);
            }
            ec--;

            if(sr > er || sc > ec) break;
            for(int j = ec;j >= sc;j--){
                ans.push_back(matrix[er][j]);
            }
            er--;
            
            if(sr > er || sc > ec) break;
            for(int i = er;i >= sr;i--){
                ans.push_back(matrix[i][sc]);
            }
            sc++;
        }

        return ans;
    }
};
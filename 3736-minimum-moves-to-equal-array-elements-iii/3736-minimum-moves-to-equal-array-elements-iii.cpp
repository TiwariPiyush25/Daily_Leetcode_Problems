class Solution {
public:
    int minMoves(vector<int>& nums) {
        int moves = 0;

        int mx = 0;
        for(auto ele : nums){
            mx = max(ele , mx);
        }

        for(auto ele : nums){
            moves += (mx - ele);
        }

        return moves;
    }
};
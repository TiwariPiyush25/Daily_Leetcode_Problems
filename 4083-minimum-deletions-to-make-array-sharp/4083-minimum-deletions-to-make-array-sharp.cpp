class Solution {
public:
    int minDeletions(vector<int>& nums) {
        int lastElement = nums[0];

        int cnt = 0;
        for(int i = 1;i < nums.size();i++){
            if(nums[i] == lastElement){
                cnt++;
            }
            else {
                lastElement = nums[i];
            }
        }

        return cnt;
    }
};
class Solution {
public:
    int peakValleyDifference(vector<int>& nums) {
        int total = 0;

        for(int i = 1;i <= nums.size() - 2;i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                total += nums[i];
            }
            else if(nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                total -= nums[i];
            }
        }

        return total;
    }
};
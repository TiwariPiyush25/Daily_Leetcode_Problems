class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();

        deque<int> dq;
        vector<int> ans;
        for(int i = 0;i < k;i++){
            // remove smaller elements from right hand side
            while(not dq.empty() && nums[dq.back()] < nums[i]){
                dq.pop_back();
            }

            dq.push_back(i);
        }
        
        ans.push_back(nums[dq.front()]);

        for(int i = k;i < n;i++){
            int curr = nums[i];

            // remove , out of window element
            if(dq.front() == i - k) dq.pop_front();

            // remove, smaller elements from right hand side
            while(not dq.empty() && nums[dq.back()] < nums[i]){ 
                dq.pop_back();
            }
            dq.push_back(i);

            ans.push_back(nums[dq.front()]);
        }

        return ans;
    }
};
class Solution {
public:
    int countTestedDevices(vector<int>& batteryPercentages) {
        int cnt = 0;

        for(auto &battery : batteryPercentages){
            if(battery > cnt){
                cnt++;
            }
        }

        return cnt;
    }
};
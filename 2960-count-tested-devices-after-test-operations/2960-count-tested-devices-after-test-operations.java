class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int cnt = 0;

        for(int ele : batteryPercentages){
            if(ele > cnt){
                cnt++;
            }
        }

        return cnt;
    }
}
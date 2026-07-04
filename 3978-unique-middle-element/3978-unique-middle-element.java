class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middle = nums[n/2];
        int cnt = 0;
        for(int ele : nums) {
            if(ele == middle) cnt++;
        }

        return cnt == 1;
    }
}
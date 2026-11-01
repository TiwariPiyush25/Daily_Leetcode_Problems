class Solution {
    public int minDeletions(int[] nums) {
        int lastElement = nums[0];

        int cnt = 0;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == lastElement){
                cnt++;
            }
            else {
                lastElement = nums[i];
            }
        }

        return cnt;
    }
}
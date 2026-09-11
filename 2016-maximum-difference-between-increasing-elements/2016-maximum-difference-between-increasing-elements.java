class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;

        int diff = -1;
        for(int i = nums.length-1;i >= 0;i--){
            if(nums[i] >= max) {
                max = nums[i];
            }
            else {
                diff = Math.max(diff , max - nums[i]);
            }
        }

        return diff;
    }
}
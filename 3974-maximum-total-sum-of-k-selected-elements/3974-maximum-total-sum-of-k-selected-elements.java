class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long totalSum = 0;

        Arrays.sort(nums);

        int i = nums.length-1;

        while(i >= 0 && k > 0){
            if(mul > 0){
                totalSum += (long)mul * (long) nums[i];
                mul--;
            }
            else totalSum += nums[i];
            k--;
            i--;
        }

        return totalSum;
    }
}
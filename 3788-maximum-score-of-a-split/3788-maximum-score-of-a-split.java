class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] SuffixMin = new int[n];
        SuffixMin[n - 1] = nums[n - 1];
        for(int i = n - 2;i >= 0;i--) {
            SuffixMin[i] = Math.min(SuffixMin[i + 1] , nums[i]);
        }

        long sum = 0;
        long maxScore = Integer.MIN_VALUE;
        for(int i = 0;i < n - 1;i++){
            sum += nums[i];

            maxScore = Math.max(maxScore , sum - SuffixMin[i + 1]);
        }

        return maxScore;
    }
}
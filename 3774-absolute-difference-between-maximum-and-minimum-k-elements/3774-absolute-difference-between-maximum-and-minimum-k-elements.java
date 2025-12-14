class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int largestsum = 0;
        int smallestsum = 0;

        for(int i=0;i<k;i++) smallestsum+=nums[i];
        for(int i=nums.length-1;i>nums.length-1-k;i--) largestsum+=nums[i];

        return Math.abs(largestsum - smallestsum);
    }
}
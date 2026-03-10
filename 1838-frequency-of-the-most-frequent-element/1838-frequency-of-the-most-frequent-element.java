class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums,0,n);

        int st = 0,end = 0;
        long totalSum = 0;
        long maxSize = 0;
        while(end < n){
            totalSum += nums[end];

            long size = end - st + 1;
            long maxSum  = size * nums[end];
            long expense = maxSum - totalSum;

            if(expense > k) {
                totalSum -= nums[st];
                st++;
            }
            else {
                maxSize = Math.max(maxSize,size);
            }
            end++;
        }

        return (int) maxSize;
    }
}
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums,0,n);

        int st = 0,end = 0;
        long totalSum = 0; long maxSize = 0;
        while(end < n){
            totalSum += nums[end];
            
            //             MaxSum(st to end)          TotalSum(st to end)
            long expense = ((long)(end-st+1) * (long)nums[end]) - totalSum;
            while(expense > k) {
                totalSum -= nums[st++];
                expense = ((long)(end-st+1) * (long)nums[end]) - totalSum;
            }

            maxSize = Math.max(end-st+1,maxSize); 
            end++;
        }

        return (int) maxSize;
    }
}
class Solution {
    public int MinimumSumSubarray(int[] arr) {
        int minSum = arr[0];
        int sum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            sum = Math.min(arr[i],sum+arr[i]);
            minSum = Math.min(minSum,sum);
        }
        return minSum;
    }
    public int MaximumSumSubarray(int[] arr) {
        int maxSum = arr[0];
        int sum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int minSum = MinimumSumSubarray(nums);
        int maxSum = MaximumSumSubarray(nums);
        if(maxSum < 0) return maxSum;
        
        int totalSum = 0;
        for(int ele : nums){
            totalSum += ele;
        }

        return Math.max(totalSum - minSum,maxSum);
    }
}
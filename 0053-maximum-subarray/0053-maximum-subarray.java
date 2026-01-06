class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int sum = arr[0];

        for(int i=1;i<arr.length;i++){
            
            sum = Math.max(arr[i],sum+arr[i]);
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }
}
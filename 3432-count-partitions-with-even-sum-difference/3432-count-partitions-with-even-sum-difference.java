class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        
        prefixSum[0] = nums[0]; suffixSum[n-1] = nums[n-1];
        for(int i = 1;i<n;i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
            suffixSum[n-i-1] = nums[n-i-1] + suffixSum[n-i];
        }

        int count = 0;
        for(int i=0;i<n-1;i++){
            if((prefixSum[i] - suffixSum[i+1]) % 2 == 0) count++;
        }

        return count;
    }
}
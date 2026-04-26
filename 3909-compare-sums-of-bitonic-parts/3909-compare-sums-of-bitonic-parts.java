class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;

        long leftSum = nums[0];
        long rightSum = nums[n-1];
        int x = 0;
        for(int i = 1;i < n - 1; i++){
            if(nums[i] > nums[i-1]){
                leftSum += nums[i];
                x = nums[i];
            }
            else rightSum += nums[i];
        }

        return leftSum > rightSum + x ? 0 : leftSum < rightSum + x ? 1 : -1;
    }
}
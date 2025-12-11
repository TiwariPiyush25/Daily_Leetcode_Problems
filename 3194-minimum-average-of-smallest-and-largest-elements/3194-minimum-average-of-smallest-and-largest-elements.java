class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        double min = Double.MAX_VALUE;
        for(int i = 0; i < n/2;i++){
            float s = nums[i] + nums[n-i-1];
            min = Math.min(s/2,min);
        }

        return min;
    }
}
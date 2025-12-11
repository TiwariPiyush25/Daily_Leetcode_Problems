class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        List<Float> lst = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n/2;i++){
            float s = nums[i] + nums[n-i-1];
            lst.add(s/2);
        }

        double min = Double.MAX_VALUE;
        for(float ele:lst) min = Math.min(min,ele);

        return min;
    }
}
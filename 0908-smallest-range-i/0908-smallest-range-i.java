class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele : nums){
            min = Math.min(ele,min);
            max = Math.max(max,ele);
        }

        min = min + k;
        max = Math.max(min,max - k);
        return max - min;
    }
}
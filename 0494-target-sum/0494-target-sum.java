class Solution {
    private int ways(int i, int[] arr, int t) {
        if (i==arr.length){
            if (t==0) return 1; // 1 valid way
            else return 0; // Not a valid way
        }
        int addways = ways(i+1,arr,t-arr[i]);
        int subways = ways(i+1,arr,t+arr[i]);

        return addways + subways;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return ways(0,nums,target);
    }
}
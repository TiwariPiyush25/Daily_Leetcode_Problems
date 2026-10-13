class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = {-1,-1};

        int product = Integer.MIN_VALUE;

        int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                int sum = nums[i] + nums[j];
                int p = nums[i] * nums[j];
                if(i != j && nums[i] > nums[j] && sum == target && p > product){
                    product = p;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }
}
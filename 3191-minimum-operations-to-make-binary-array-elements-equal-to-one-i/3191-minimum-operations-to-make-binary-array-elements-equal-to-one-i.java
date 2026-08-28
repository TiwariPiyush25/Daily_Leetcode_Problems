class Solution {
    public int minOperations(int[] nums) {
        int opr = 0;
        int n = nums.length;
        for(int i = 0;i < n - 2;i++){
            if(nums[i] == 1) continue;
            for(int j = i;j < i + 3;j++){
                nums[j] = 1 - nums[j];
            }

            opr++;
        }

        

        return ((nums[n-1] == 0) || (nums[n-2] == 0)) ? -1 : opr;
    }
}
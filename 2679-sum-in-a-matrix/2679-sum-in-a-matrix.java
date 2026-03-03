class Solution {
    public int matrixSum(int[][] nums) {
        for(int[] num:nums) Arrays.sort(num);

        int score = 0;
        for(int j = nums[0].length-1;j>=0;j--){
            int max = 0;
            for(int i=0;i<nums.length;i++){
                max = Math.max(nums[i][j],max);
            }

            score += max;
        }
        return score;
    }
}
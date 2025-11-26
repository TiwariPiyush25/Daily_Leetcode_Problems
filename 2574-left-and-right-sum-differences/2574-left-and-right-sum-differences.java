class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
            leftsum[i] = nums[i-1] + leftsum[i-1];
        }

        int[] rightsum = new int[nums.length];
        for(int i = nums.length-2;i>=0;i--){
            rightsum[i] = nums[i+1] + rightsum[i+1];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(leftsum[i] - rightsum[i]);
        } 

        return nums; 
    }
}
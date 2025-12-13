class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int idx=0;idx<nums.length;idx++){
            int leftsum = 0;
            int rightsum = 0;

            for(int j=idx-1;j>=0;j--){
                leftsum+=nums[j];
            }

            for(int j=idx+1;j<nums.length;j++){
                rightsum+=nums[j];
            }

            if(leftsum==rightsum) return idx;
        }

        return -1;
    }
}
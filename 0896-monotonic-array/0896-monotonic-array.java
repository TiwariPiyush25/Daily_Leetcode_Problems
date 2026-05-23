class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flagInc = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                flagInc = false;
                break;
            }
        }

        boolean flagDec = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                flagDec = false;
                break;
            }
        }

        return flagInc || flagDec;
    }
}
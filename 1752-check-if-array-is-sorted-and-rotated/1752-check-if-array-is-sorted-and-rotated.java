class Solution {
    public boolean check(int[] nums) {
        boolean flag = false;

        for(int i = 1;i < nums.length;i++){
            if(nums[i-1] > nums[i]){
                if(!flag) flag  = true;
                else return false;
            }
            if(flag && nums[i] > nums[0]) return false;
        }

        return true;
    }
}
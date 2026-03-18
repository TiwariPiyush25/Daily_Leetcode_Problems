class Solution {
    public boolean canJump(int[] nums) {
        int farthestReach = 0;
        for(int i=0;i<nums.length;i++){
            if(i > farthestReach){
                return false;
            }
            if(i >= nums.length-1) return true;
            
            int CurrmaxJump = i + nums[i];
            farthestReach = Math.max(farthestReach,CurrmaxJump);
        }

        return true;
    }
}
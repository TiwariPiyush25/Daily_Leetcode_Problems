class Solution {
    public boolean canJump(int[] nums) {
        int farthestReach = 0;
        for(int i=0;i<nums.length;i++){
            if(i > farthestReach){
                return false;
            }
            
            int CurrmaxJump = i + nums[i];
            farthestReach = Math.max(farthestReach,CurrmaxJump);
            if(farthestReach >= nums.length-1) return true;
        }

        return true;
    }
}
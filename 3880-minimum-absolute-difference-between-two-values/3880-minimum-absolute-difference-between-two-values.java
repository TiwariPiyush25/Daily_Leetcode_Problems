class Solution {
    public int minAbsoluteDifference(int[] nums) {
        boolean flag1 = false , flag2 = false;
        for(int ele:nums){
            if(ele == 1) flag1 = true;
            else if(ele == 2) flag2 = true;
        }

        if(!flag1 || !flag2) return -1;
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[i] == 1 && nums[j] == 2)||(nums[i] == 2 && nums[j] == 1)){
                    mindiff = Math.min(mindiff,Math.abs(i-j));
                }
            }
        }

        return mindiff;
    }
}
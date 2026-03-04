class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int ele:nums){
            max = Math.max(ele,max);
            min = Math.min(ele,min);
        }

        for(int ele:nums){
            if(ele!=min && ele!=max){
                return ele;
            }
        }

        return -1;
    }
}
class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int min = nums[0] , max = nums[n-1];
        for(int ele:nums){
            if(ele!=min && ele!=max){
                return ele;
            }
        }

        return -1;
    }
}
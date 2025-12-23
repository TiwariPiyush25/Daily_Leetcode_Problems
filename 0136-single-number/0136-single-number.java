class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]!=Integer.MIN_VALUE && nums[i] == nums[j]){
                    nums[i] = Integer.MIN_VALUE;
                    nums[j] = Integer.MIN_VALUE;
                }
            }
        }

        for(int ele:nums) if(ele!=Integer.MIN_VALUE) return ele;

        return nums[0];
    }
}
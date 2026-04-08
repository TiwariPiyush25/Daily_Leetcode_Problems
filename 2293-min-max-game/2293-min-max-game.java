class Solution {
    public int minMaxGame(int[] nums) {
        int size = nums.length;
        while(size > 1){
            int i = 0 , j = 0;
            while(i < size){
                if(j % 2 == 0){
                    nums[j] = Math.min(nums[i],nums[i+1]);
                }
                else {
                    nums[j] = Math.max(nums[i],nums[i+1]);
                }

                i += 2; j++;
            }
            size /= 2;
        }

        return nums[0];
    }
}
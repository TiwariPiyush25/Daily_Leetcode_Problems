class Solution {
    public int minOperations(int[] nums) {
        int total = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                int prevvalue = nums[i];
                int newvalue = nums[i-1] + 1;
                nums[i] = newvalue;

                total += newvalue - prevvalue;
            }
        }

        return total;
    }
}
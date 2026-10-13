class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long sum = 0;
        long minsum = 0;
        for(int i = 0; i < len;i++){
            if(nums[i]<0){
                nums[i] = nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        for(int i = 0; i < len;i++){
            sum+=nums[i]*nums[i];
        }
        
        for(int i = 0; i < len/2;i++){
            minsum += nums[i]*nums[i];
        }
        return sum - 2*minsum;
    }
}
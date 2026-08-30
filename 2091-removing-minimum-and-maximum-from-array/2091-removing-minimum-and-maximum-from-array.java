class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx = 0;
        int maxidx = 0;
        
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }

            if(nums[i] < nums[minidx]){
                minidx = i;
            }
        }

        int low = Math.min(minidx , maxidx), high = Math.max(maxidx , minidx) , n = nums.length;
        return Math.min(Math.min(high + 1,low + n - high + 1), n - low);
    }
}
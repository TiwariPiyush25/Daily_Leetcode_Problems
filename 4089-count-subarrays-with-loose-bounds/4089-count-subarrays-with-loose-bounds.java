class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int st = 0;
        int end = 0;

        long count = 0;
        while(end < nums.length){
            if(!(nums[end] >= minK && nums[end] <= maxK)){
                long len = end - st;
                count += ((len * (len + 1)) / 2);
                st = end + 1;
            }
        
            end++;
        }

        long len = end - st;
        count += ((len * (len + 1)) / 2);

        return count;
    }
}
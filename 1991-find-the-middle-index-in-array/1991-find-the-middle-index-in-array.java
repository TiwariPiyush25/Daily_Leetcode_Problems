class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = nums[i] + suffix[i+1];
        }

        for(int idx=0;idx<nums.length;idx++){
            int leftsum = 0; if(idx>0) leftsum = prefix[idx-1];
            int rightsum = 0; if(idx<nums.length-1) rightsum = suffix[idx+1];
           if(leftsum==rightsum) return idx;
        }

        return -1;
    }
}
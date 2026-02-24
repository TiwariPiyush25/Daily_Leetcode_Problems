class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        boolean flag = false;

        for(int i=1;i<n;i++){
            if(nums[i] < nums[i-1]) flag = true;
            if(flag) min = Math.min(min,nums[i]);
        }

        flag = false;
        for(int i=n-2;i>=0;i--){
            if(nums[i] > nums[i+1]) flag = true;
            if(flag) max = Math.max(max,nums[i]);
        }

        int l,r;
        for(l=0;l<n;l++){
            if(nums[l]>min) break;
        }

        for(r=n-1;r>=0;r--){
            if(nums[r]<max) break;
        }

        return r-l<0 ? 0 : r-l+1;
    }
}
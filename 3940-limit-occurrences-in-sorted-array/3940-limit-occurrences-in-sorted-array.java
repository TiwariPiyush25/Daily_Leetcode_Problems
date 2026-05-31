class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int l = 0;
        while(j < nums.length){
            while(j < nums.length && j - i < k && nums[i] == nums[j]){
                nums[l++] = nums[j++];
            }

            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            i = j;
        }

        int[] ans = new int[l];
        for(int m = 0;m < l;m++){
            ans[m] = nums[m];
        }

        return ans;
    }
}
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < nums.length){
            int sum = nums[i] + k;
            while(j < nums.length && nums[j]<=sum){
                j++;
            }

            count++;
            i = j;
        }

        return count;
    }
}
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int j = 1;
        int k = 2;
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            while(j<nums.length && nums[j] < nums[i] + diff){
                j++;
            }

            if(j>= nums.length || nums[j] != nums[i] + diff) continue;

            while(k<nums.length && nums[k] < nums[j] + diff){
                k++;
            }

            if(k<nums.length && nums[k] == nums[j] + diff){
                count++;
            }
        }

        return count;
    }
}
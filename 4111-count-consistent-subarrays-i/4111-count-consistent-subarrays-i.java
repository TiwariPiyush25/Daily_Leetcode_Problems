class Solution {
    public int countConsistent(int[] nums) {
        int counter = 0 , n = nums.length;
        for(int i = 0;i < n;i++) {
            int minValue = Integer.MAX_VALUE , val = nums[i];
            for(int j = i;j < n;j++){
                minValue = Math.min(minValue , nums[j]);
                val = val & nums[j];
                
                if(val == minValue) counter++;
            } 
        }

        return counter;
    }
}
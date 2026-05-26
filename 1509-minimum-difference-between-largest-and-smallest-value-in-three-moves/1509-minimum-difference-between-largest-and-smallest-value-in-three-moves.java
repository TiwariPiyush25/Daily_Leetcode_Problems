class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n <= 3) return 0;
        
        int i = 3;
        int j = n;
        int mindiff = Integer.MAX_VALUE;
        while(i >= 0){
            int max = nums[j-1];
            int min = nums[i];

            mindiff = Math.min(mindiff , max - min);
            i--; j--;
        }

        return mindiff;
    }
}
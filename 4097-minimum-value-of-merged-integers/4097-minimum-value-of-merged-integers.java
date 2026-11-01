class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i += 2){
            int copy = nums[i+1];

            int d = 0;
            while(copy > 0){
                copy /= 10;
                d++;
            } 

            int val = nums[i] * (int) Math.pow(10 , d) + nums[i + 1];
            min = Math.min(min , val);
        }

        return min;
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        int i = nums.length-1;
        while(i >= 0){
            if(nums[i] > c){
                c = nums[i];
            }
            else if(nums[i] > b && nums[i] > a && nums[i] < c){
                b = nums[i];
            }
            else if(nums[i] > a && nums[i] < b && nums[i] < c){
                a = nums[i];
            }
            i--;
        }
        if(a == Integer.MIN_VALUE) return false;
        return a < b && b < c;
    }
}
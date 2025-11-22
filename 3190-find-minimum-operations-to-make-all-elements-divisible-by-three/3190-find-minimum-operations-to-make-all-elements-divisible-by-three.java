class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for(int ele : nums){
            if(ele%3!=0){
                int rem = ele % 3;
                count += Math.min(3-rem , rem);
            }
        }

        return count;
    }
}
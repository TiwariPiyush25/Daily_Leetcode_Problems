class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int ele:nums) x ^=ele;

        int y = x & (x-1);
        int mask = x ^ y;

        int b1 = 0; // for != 0
        int b2 = 0; // for == 0

        for (int ele:nums){
            if ((ele & mask) == 0) b1 ^= ele;
            else b2 ^= ele;
        }

        int[] ans = {b1,b2};
        return ans;
    }
}
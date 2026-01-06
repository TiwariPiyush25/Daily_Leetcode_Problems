class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;

        int total = 1 << nums.length;
        int sum = 0;

        for(int num=0;num<total;num++){
            int xor = 0;
            for(int bitidx=0;bitidx<n;bitidx++){
                int mask = 1 << bitidx;

                if((num & mask)!=0) xor ^= nums[bitidx];
            }
            sum += xor;
        }

        return sum;
    }
}
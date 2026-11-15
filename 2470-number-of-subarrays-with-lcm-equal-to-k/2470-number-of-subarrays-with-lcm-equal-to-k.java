class Solution {
    public long gcd(long a,long b){
        return (a % b == 0) ? b : gcd(b ,a % b);
    }
    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length ,counter = 0;

        for(int i = 0;i < n;i++) {
            long val = (long) nums[i];
            if(val == (long) k) counter++;

            for(int j = i;j < n - 1;j++){
                long g = gcd(val , (long) nums[j + 1]);
                val = val * nums[j + 1] / g;
                System.out.println(val);
                if(val == (long) k) counter++;
                if(val > k) break;
            }
        }

        return counter;
    }
}
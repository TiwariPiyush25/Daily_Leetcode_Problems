class Solution {
    public int encrypt(int n){
        int cnt = 0;
        int max = 0;

        while(n > 0){
            int ld = n % 10;
            cnt++;
            max =  Math.max(ld,max);
            n /= 10;
        }

        int val = 0;
        while(cnt-- > 0){
            val = val * 10 + max;
        }

        return val;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += encrypt(x);
        }

        return sum;
    }
}
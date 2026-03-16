class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;

        int[] Primes = new int[n];
        for(int i = 2;i<n;i++){
            Primes[i] = 1;
        }

        for(int i=2;i<n;i++){
            if(Primes[i] == 1){
                for(int j=2*i;j<n;j+=i){
                    Primes[j] = 0;
                }
            }
        }

        long SumA = 0;
        long SumB = 0;
        for(int i=0;i<n;i++){
            if(Primes[i] == 1) SumA += nums[i];
            else SumB += nums[i];
        }

        return Math.abs(SumA - SumB);
    }
}
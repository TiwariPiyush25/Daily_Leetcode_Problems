class Solution {
    public int countPrimes(int n) {
        int[] Primes = new int[n];

        for (int i=2;i<n;i++) Primes[i] = 1;

        for (int i=2;i<n;i++){
            if (Primes[i]==1){
                for (int j = 2*i;j<n;j+=i){
                    Primes[j] = 0;
                }
            }
        }
        int count = 0;
        for(int i = 2;i<n;i++) if(Primes[i]==1) count++;

        return count;
    }
}
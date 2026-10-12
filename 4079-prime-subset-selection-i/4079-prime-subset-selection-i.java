class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        int[] Primes = new int[n + 1];
        Arrays.fill(Primes, 1);

        for (int i = 2; i * i <= n; i++) {
            if (Primes[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    Primes[j] = 0;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (Primes[i] == 1) {
                if (sum + i <= s) {
                    sum += i;
                    ans.add(i);
                }
                else break;
            }
        }

        return ans;
    }
}
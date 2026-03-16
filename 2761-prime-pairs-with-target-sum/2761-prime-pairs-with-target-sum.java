class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        int[] Primes = new int[n];

        for(int i = 2;i<n;i++){
            Primes[i] = 1;
        }

        for(int i =2;i<n;i++){
            if(Primes[i] == 1){
                for(int j=2*i;j<n;j+=i){
                    Primes[j] = 0;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<n;i++){
            if(Primes[i] == 1 && Primes[n-i] == 1 && (set.contains(n-i) || n-i == i)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(n-i);
                temp.add(i);

                ans.add(temp);
            }
            if(Primes[i] == 1) set.add(i);
        }

        Collections.sort(ans,(a,b) -> a.get(0) - b.get(0));
        return ans;
    }
}
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        int[] Primes = new int[n];
        for(int i = 2;i<n;i++){
            Primes[i] = 1;
        }

        for(int i = 2;i<n;i++){
            if(Primes[i] == 1){
                for(int j=2*i;j<n;j+=i){
                    Primes[j] = 0;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<n;i++){
            if(!set.contains(i) && !set.contains(n-i) && Primes[i]==1 && Primes[n-i]==1) {
                List<Integer> temp = new ArrayList<>();
                temp.add(Math.min(i,n-i));
                temp.add(Math.max(i,n-i));
                set.add(i);  set.add(n-i);

                ans.add(temp);
            }
        }

        return ans;
    }
}
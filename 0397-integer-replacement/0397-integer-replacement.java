class Solution {
    public int findmin(long n,HashMap<Long,Integer> dp){
        if(n==1) return 0;

        if(dp.containsKey(n)) return dp.get(n);

        int even = 0,odd = 0;
        if(n%2==0) even = 1 + findmin(n/2,dp);
        else {
            odd = 1 + Math.min(findmin(n+1,dp),findmin(n-1,dp));
        }

        int ans = even + odd;
        dp.put(n,ans);

        return ans;
    }
    public int integerReplacement(int n) {
        HashMap<Long,Integer> dp = new HashMap<>();
        return findmin((long)n,dp);
    }
}
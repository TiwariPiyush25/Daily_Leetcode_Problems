class Solution {
    public int helper(int n,HashMap<Integer,Integer> dp){
        if(n <= 0) return 0;

        if(dp.containsKey(n)) return dp.get(n);
        
        int div2 = (n % 2) + helper(n / 2,dp);
        int div3 = (n % 3) + helper(n / 3,dp);

        int ans = 1 + Math.min(div2 , div3);
        dp.put(n , ans);
        return ans;
    }
    public int minDays(int n) {
        HashMap<Integer,Integer> dp = new HashMap<>();

        return helper(n,dp) - 1;
    }
}
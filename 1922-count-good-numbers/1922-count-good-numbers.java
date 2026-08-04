class Solution {
    public int mod = 1000000007;
    public long helper1(long n){
        if(n == 0) return 1;
        
        long val = helper1(n/2);
        if(n % 2 == 0){
            return (val * val) % mod;
        }
        return (5 * val * val) % mod;
    }
    public long helper2(long n){
        if(n == 0) return 1;
        
        long val = helper2(n/2);
        if(n % 2 == 0){
            return (val * val) % mod;
        }
        return (4 * val * val) % mod;
    }
    public int countGoodNumbers(long n) {
        boolean flag = false;

        if(n % 2 != 0){
            flag = true;
            n--;
        }

        long a1 = helper1(n/2);
        long a2 = helper2(n/2);

        long ans = (a1 * a2) % mod;
        if(flag) ans = (ans * 5) % mod;
        return (int) ans;
    }
}
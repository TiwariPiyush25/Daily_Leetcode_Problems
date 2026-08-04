class Solution {
public:
    int mod = 1000000007;
    long long helper1(long n){
        if(n == 0) return 1;
        
        long val = helper1(n/2);
        if(n % 2 == 0){
            return (val * val) % mod;
        }
        return (5 * val * val) % mod;
    }
    long long helper2(long n){
        if(n == 0) return 1;
        
        long val = helper2(n/2);
        if(n % 2 == 0){
            return (val * val) % mod;
        }
        return (4 * val * val) % mod;
    }
    int countGoodNumbers(long long n) {
        long long a1 = helper1(n/2);
        long long a2 = helper2(n/2);

        long long ans = (a1 * a2) % mod;
        if(n % 2 != 0) ans = (ans * 5) % mod;
        return (int) ans;
    }
};
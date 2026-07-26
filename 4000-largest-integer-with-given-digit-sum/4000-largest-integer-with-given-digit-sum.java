class Solution {
    public int largestInteger(int n, int s) {
        if(n * 9 < s) return -1;

        int val = 0;
        int sum = 0;
        int cnt = 0;
        int digit = 9;
        while(cnt < n && sum <= s){
            while(cnt < n && sum + digit <= s){
                sum += digit;
                val = val * 10 + digit;
                cnt++;
            }
            digit--;
        }

        return val;
    }
}
class Solution {
    public int largestInteger(int n, int s) {
        if(n * 9 < s) return -1;

        int val = 0 , sum = 0;
        int digit = 9;
        while(n > 0){
            while(n > 0 && sum + digit <= s){
                sum += digit;
                val = val * 10 + digit;
                n--;
            }
            digit--;
        }

        return val;
    }
}
class Solution {
    public int numSub(String s) {
        int i = 0;
        int j = 0;

        int mod = 1000000007;
        long ans = 0;
        while(j < s.length()){
            if(s.charAt(j) == '0') {
                long len = j - i;
                ans += len * (len + 1) / 2;
                while(j < s.length() && s.charAt(j) == '0') j++;
                i = j;
            }
            else j++;
        }

        if(i != j){
            long len = j - i;
            ans = (ans + len * (len + 1) / 2);
        }

        return (int) (ans % mod);
    }
}
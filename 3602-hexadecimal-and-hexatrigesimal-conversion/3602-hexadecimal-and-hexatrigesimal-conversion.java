class Solution {
    public String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String convert(int n,int base){
        String ans = "";

        while(n >= base){
            int rem = n % base;
            ans = chars.charAt(rem) + ans;
            n /= base;
        }

        if(n > 0) ans = chars.charAt(n) + ans;

        return ans;
    }
    public String concatHex36(int n) {
        String s = convert(n * n , 16);
        String t = convert(n * n * n , 36);
        
        return s + t;
    }
}
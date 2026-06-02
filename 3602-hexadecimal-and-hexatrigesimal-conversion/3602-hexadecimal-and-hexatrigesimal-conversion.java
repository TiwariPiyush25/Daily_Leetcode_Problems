class Solution {
    public String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String hexaDecimal(int n){
        String ans = "";

        while(n >= 16){
            int rem = n % 16;
            ans = chars.charAt(rem) + ans;
            n /= 16;
        }

        if(n > 0) ans = chars.charAt(n) + ans;

        return ans;
    }
    public String hexatrigesimal(int n){
        String ans = "";

        while(n >= 36){
            int rem = n % 36;
            ans = chars.charAt(rem) + ans;
            n /= 36;
        }

        if(n > 0) ans = chars.charAt(n) + ans;

        return ans;
    }
    public String concatHex36(int n) {
        String s = hexaDecimal(n * n);
        String t = hexatrigesimal(n * n * n);
        
        return s + t;
    }
}
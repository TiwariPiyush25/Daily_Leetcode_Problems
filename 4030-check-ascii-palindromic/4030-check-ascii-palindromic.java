class Solution {
    public String binary(int n){
        String res = "";
        while(n > 2){
            int ld = n % 2;
            res = ld + res;
            n /= 2;
        }

        if(n > 0) res = n + res;
        
        while(res.length() < 8){
            res = 0 + res;
        }

        return res;
    }
    public boolean isPalindromic(String s) {
        String res = "";
        for(int i = 0;i < s.length();i++){
            int ascii = (int) s.charAt(i);

            res += binary(ascii);
        }

        int i = 0, j = res.length() - 1;
        while(i < j){
            if(res.charAt(i) != res.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }
}
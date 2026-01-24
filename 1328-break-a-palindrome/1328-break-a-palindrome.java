class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n==1) return "";

        String res = "";
        boolean flag = true;
        for(int i=0;i<n/2;i++){
            char ch = palindrome.charAt(i);

            if(ch!='a'){
                flag = false;
                res += palindrome.substring(0,i);
                res += 'a';
                res += palindrome.substring(i+1);

                break;
            }
        }

        if(flag) return palindrome.substring(0,n-1) + 'b';

        return res;
    }
}
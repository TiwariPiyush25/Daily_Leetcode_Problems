class Solution {
    public String thousandSeparator(int n) {
        if(n==0) return "0";
        int dig=0;

        String ans="";
        while(n>0){
            int rem=rem=n%10;
            dig++;

            ans=rem+ans;
            n/=10;

            if(dig==3 && n>0) {
                ans = "." + ans;
                dig=0;
            }
        }

        return ans;
    }
}
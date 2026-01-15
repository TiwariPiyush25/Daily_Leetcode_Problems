class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') cnt++;
        }

        String ans = "1";
        cnt--;

        for(int i=n-1;i>0;i--){
            if(i==cnt && cnt>0){
                ans = 1 + ans;
                cnt--;
            }
            else{
                ans = 0 + ans;
            }
        }

        return ans;
    }
}
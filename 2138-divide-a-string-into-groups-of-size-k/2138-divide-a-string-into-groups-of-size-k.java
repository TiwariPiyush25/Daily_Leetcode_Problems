class Solution {
    public String[] divideString(String s, int k, char fill) {
        int i=0; int j=0;
        int n = s.length();
        
        int len = n / k;
        if(n%k!=0) len++;
        String[] ans = new String[len];
        int l = 0;
        while(j < n){
            if((j-i) < k) j++;
            else{
                ans[l++] = s.substring(i,j);
                i = j;
            }
        }
        int size = j-i;
        if(l < ans.length) {
            while(size < k){
                s += fill;
                size++;
            }

            ans[l] = s.substring(i);
        }

        return ans;
    }
}
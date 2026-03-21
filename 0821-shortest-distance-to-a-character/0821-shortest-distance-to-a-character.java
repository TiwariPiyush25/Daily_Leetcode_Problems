class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        
        int idx = n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c) idx = 0;
            ans[i] = idx++;
        }

        idx = n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == c) idx = 0;
            ans[i] = Math.min(idx++,ans[i]);
        }
        return ans;
    }
}
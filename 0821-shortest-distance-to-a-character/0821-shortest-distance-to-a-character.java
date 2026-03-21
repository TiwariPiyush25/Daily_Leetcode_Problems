class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int idx = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c) idx = i;
            prefix[i] = idx;
        }

        idx = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == c) idx = i;
            suffix[i] = idx;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c) {
                ans[i] = 0;
                continue;
            }
            else {
                int x1 = Math.abs(i-prefix[i]);
                int x2 = Math.abs(i-suffix[i]);

                ans[i] = Math.min(x1,x2);
            }
        }

        return ans;
    }
}
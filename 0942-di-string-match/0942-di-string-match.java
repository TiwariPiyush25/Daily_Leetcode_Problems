class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();

        int st = 0;
        int end = n;

        int[] ans = new int[s.length()+1];

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I') {
                ans[i] = st;
                st++;
            }
            else {
                ans[i] = end;
                end--;
            }
        }

        if(s.charAt(n-1)=='I') {
                ans[n] = st;
        }
        else {
            ans[n] = end;
        }

        return ans;
    }
}
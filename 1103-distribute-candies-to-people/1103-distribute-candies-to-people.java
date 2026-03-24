class Solution {
    public int[] distributeCandies(int c, int n) {
        int i = 0;
        int[] ans = new int[n];
        while(c > 0){
            int idx = i % n;
            if(c >= i+1){
               ans[idx] += i+1;
            }
            else {
                ans[idx] += c;
            }
            c -= (i+1);     
            i++;
        }

        return ans;
    }
}
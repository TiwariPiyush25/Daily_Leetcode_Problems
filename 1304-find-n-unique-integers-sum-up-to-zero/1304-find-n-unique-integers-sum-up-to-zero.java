class Solution {
    public int[] sumZero(int n) {
        int st = n/2;
        
        int[] ans = new int[n];
        int j = 0;
        for(int i=-st;i<=st;i++){
            if(n%2 == 0 && i == 0){
                continue;
            }
            ans[j] = i;
            j++;
        }

        return ans;
    }
}
class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        
        for(int i = 0;i < m;i++){
            String res = "";
            for(int j = 0;j < n;j++){
                if(i == m-1 || j == 0){
                    res += '.';
                }
                else res += '#';
            }
            ans[i] = res;
        }

        return ans;
    }
}
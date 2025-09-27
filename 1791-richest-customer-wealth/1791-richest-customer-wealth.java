class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int i=0;i<m;i++){
            int currwealth=0;
            for(int j=0;j<n;j++){
                currwealth+=accounts[i][j];
            }

            maxwealth=Math.max(maxwealth,currwealth);
        }

        return maxwealth;
    }
}
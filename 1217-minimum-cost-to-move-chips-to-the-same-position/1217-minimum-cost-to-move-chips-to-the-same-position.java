class Solution {
    public int minCostToMoveChips(int[] position) {
        int cnt1 = 0; // Chips At Even indexes
        int cnt2 = 0; // chips At odd indexes

        for(int i = 0;i < position.length;i++){
            if(position[i] % 2 == 0) cnt1++;
            else cnt2++;
        }
        return Math.min(cnt1,cnt2);
    }
}
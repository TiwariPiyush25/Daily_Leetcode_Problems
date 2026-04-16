class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long cnt = 0;

        for(int sum = 0;sum <= total;sum += cost1){
            cnt += (total - sum) / cost2;
            cnt++; // for zero every time
        }

        return cnt;
    }
}
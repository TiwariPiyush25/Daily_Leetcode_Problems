class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long cnt = 0;

        for(int sum = 0;sum <= total;sum += cost1){ // pens
            cnt++; // for zeroth pencil every time
            cnt += (total - sum) / cost2; // pencils
        }

        return cnt;
    }
}
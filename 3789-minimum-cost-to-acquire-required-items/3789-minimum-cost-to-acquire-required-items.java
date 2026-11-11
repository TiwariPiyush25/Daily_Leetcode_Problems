class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long type1 = (long) cost1 * (long) need1;
        type1 += (long) cost2 * (long) need2;

        long type2 = (long) Math.max(need1,need2) * costBoth;

        int min = Math.min(need1 , need2);
        long type3 = (long) min * (long) costBoth;
        type3 += (long) (need1 - min) * (long) cost1;
        type3 += (long) (need2 - min) * (long) cost2;

        return Math.min(type1 , Math.min(type2 , type3));
    }
}
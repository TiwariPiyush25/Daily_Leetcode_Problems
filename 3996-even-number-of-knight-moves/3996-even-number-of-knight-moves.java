class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (Math.abs(target[0] - start[0]) + Math.abs(target[1] - start[1])) % 2 == 0;
    }
}
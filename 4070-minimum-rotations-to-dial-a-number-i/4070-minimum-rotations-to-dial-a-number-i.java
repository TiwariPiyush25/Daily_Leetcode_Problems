class Solution {
    public int minRotations(String s) {
        int total = 0;

        int curr = 0;
        for(int i = 0;i < 10;i++){
            int val = (int) s.charAt(i) - '0';

            int direct = Math.abs(val - curr);
            int rotation = (10 - direct);
            total += Math.min(direct , rotation);
            curr = val;
        }

        return total;
    }
}
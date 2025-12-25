class Solution {
    public int minBitFlips(int start, int goal) {
        int res = start ^ goal;

        int flips  = 0;
        while(res != 0){
            res = res & (res-1);
            flips++;
        }

        return flips;
    }
}
class Solution {
    public int reverseBits(int n) {
        int i = 0, j = 31;
        while (i<j){
            int imask = 1 << i; // mask for ith bit
            int jmask = 1 << j; // mask for jth bit

            boolean IisSet = (n & imask) == 0;
            boolean JisSet = (n & jmask) == 0;

            if (IisSet != JisSet){
                n ^= imask; // flipped ith bit
                n ^= jmask; // flipped jth bit
            }

            i++;
            j--;
        }

        return n;
    }
}
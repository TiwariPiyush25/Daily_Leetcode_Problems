class Solution {
    public boolean canAliceWin(int n) {
        int x = 10;

        int i = 0;
        while(n >= (x-i)){
            n -= (x-i);
            i++;
        }

        return i % 2 != 0 && n < (x-i);
    }
}
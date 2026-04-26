class Solution {
    public boolean validDigit(int n, int x) {
        String s = "" + n;
        int idx = s.indexOf(""+x);
        return idx == 0 || idx == -1 ? false : true;
    }
}
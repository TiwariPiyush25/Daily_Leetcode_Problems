class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c1=((int)coordinates.charAt(0))-96;
        int c2=((int)coordinates.charAt(1)) - '0';

        if((c1+c2)%2==0) return false;
        return true;
    }
}
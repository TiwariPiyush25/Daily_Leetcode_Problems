class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum1 = (int)(coordinates.charAt(0) - 'a' + 1) + (int)(coordinates.charAt(1) - '0');

        return sum1 % 2 != 0;
    }
}
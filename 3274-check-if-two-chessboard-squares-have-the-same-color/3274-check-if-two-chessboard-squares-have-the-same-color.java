class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int sum1 = (int)(coordinate1.charAt(0) - 'a' + 1) + (int)(coordinate1.charAt(1) - '0');
        int sum2 = (int)(coordinate2.charAt(0) - 'a' + 1) + (int)(coordinate2.charAt(1) - '0');

        return (sum1 % 2 == 0 && sum2 % 2 == 0) ||  (sum1 % 2 != 0 && sum2 % 2 != 0);
    }
}
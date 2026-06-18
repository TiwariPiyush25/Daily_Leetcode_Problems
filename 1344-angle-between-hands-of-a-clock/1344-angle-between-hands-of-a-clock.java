class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
        double ans = Math.abs(30*hour - 5.5 * (double)minutes);
        return ans > 180 ? 360.0 - ans : ans;
    }
}
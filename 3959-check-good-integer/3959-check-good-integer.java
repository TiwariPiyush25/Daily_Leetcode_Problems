class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;

        while(n > 0){
            int ld = n % 10;
            digitSum += ld;
            squareSum += ld * ld;
            n /= 10;
        }

        return squareSum - digitSum >= 50;
    }
}
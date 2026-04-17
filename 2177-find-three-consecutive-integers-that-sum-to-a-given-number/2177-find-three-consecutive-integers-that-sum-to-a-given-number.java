class Solution {
    public long[] sumOfThree(long n) {
        long x = (n / 3) - 1;
        long totalSum = (x+2) * (x+3) / 2;
        long sum = (x-1) * x / 2;

        if(totalSum - sum == n) return new long[]{x,x+1,x+2};
        return new long[0];
    }
}
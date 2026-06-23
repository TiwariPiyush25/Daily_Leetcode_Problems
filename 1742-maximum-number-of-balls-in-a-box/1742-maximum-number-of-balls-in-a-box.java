class Solution {
    public int getSum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n/=10;
        }

        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[highLimit+1];

        int max = Integer.MIN_VALUE;
        for(int i = lowLimit;i <= highLimit;i++){
            int sum = getSum(i);
            arr[sum]++;

            max = Math.max(arr[sum],max);
        }
        return max;
    }
}
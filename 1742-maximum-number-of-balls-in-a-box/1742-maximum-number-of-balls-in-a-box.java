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
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        for(int i = lowLimit;i <= highLimit;i++){
            int sum = getSum(i);
            map.put(sum ,map.getOrDefault(sum,0)+1);

            max = Math.max(max,map.get(sum));
        }
        return max;
    }
}
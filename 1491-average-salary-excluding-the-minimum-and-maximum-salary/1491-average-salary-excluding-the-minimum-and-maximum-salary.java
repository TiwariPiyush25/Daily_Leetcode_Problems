class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        double sum = 0;
        for(int ele:salary){
            sum += ele;
            min = Math.min(ele,min);
            max = Math.max(ele,max);
        }

        int len = salary.length;
        len -= 2;
        return (sum - min - max) / len;
    }
}
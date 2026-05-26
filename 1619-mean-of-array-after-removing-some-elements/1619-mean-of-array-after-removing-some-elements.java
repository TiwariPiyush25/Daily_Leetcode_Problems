class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;

        int cnt = (len * 5) / 100;
        double sum = 0;
        for(int i = cnt;i < len - cnt;i++){
            sum += arr[i];
        }

        return sum / (len - (2 * cnt));
    }
}
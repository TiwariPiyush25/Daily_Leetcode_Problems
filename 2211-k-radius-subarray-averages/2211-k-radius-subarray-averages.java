class Solution {
    public int[] getAverages(int[] arr, int k) {
        int st = 0;
        int end = 0;

        long sum = 0;
        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);

        while(end<arr.length){
            sum += arr[end];
            int len = end - st + 1;

            if(len > 2 * k + 1){
                sum -= arr[st];
                st++;
                len--;
            }
            
            if(len == 2 * k + 1){
                ans[st + k] = (int) (sum / len);
            }

            end++;
        }

        return ans;
    }
}
class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;

        int st = 0, end = 0;
        int cnt = 0;
        int maxlen = 0;
        while(end < n){
            while(cnt > k){
                if(arr[st] == 0) cnt--;
                st++;
            }

            if(arr[end] == 0){
                cnt++;
            }
            if(cnt <= k){
                int len = end - st + 1;
                maxlen = Math.max(len,maxlen);
            }
            end++;
        }

        return maxlen;
    }
}
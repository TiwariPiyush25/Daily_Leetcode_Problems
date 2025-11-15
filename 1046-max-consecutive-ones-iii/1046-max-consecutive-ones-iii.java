class Solution {
    public int longestOnes(int[] arr, int k) {
        int st=0;
        int end=0;
        int count = 0;
        int maxlen = 0;
        while(end<arr.length){
            while(count>k) {
                if(arr[st]==0) count--;
                st++;
            }

            if(arr[end]==0) count++;
            if(count  <= k){
                int len = end - st + 1;
                maxlen = Math.max(maxlen,len);
            }

            end++;
        }

        return maxlen;
    }
}
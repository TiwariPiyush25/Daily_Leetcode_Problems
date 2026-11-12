class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length , maxlen = 0 ,i = 0, j = 0;

        int len = 0;
        while(j < n) {
            if(i == j || nums[j] > nums[j - 1]) {
                len++;
                j++;
            }
            else {
                maxlen = Math.max(len , maxlen);
                len = 0;
                i = j;
            }
        }
        maxlen = Math.max(maxlen , len);

        len = 0; i = 0; j = 0;
        while(j < n) {
            if(i == j || nums[j] < nums[j - 1]) {
                len++;
                j++;
            }
            else {
                maxlen = Math.max(len , maxlen);
                len = 0;
                i = j;
            }
        }

        maxlen = Math.max(maxlen , len);

        return maxlen;
    }
}
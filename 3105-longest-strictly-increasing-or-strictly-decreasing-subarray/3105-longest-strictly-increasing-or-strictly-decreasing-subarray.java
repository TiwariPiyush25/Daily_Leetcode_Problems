class Solution {
    public boolean isit(int a,int b,char ch) {
        if((ch == 'i' && a > b) || (ch == 'd' && a < b)) return true;
        return false;
    }
    public int findLen(int[] nums,char ch) {
        int n = nums.length,maxlen = 0,i = 0,j = 0,len = 0;

        while(j < n) {
            if(i == j || isit(nums[j],nums[j-1],ch)) { 
                len++; j++;
            }
            else {
                maxlen = Math.max(maxlen , len);
                i = j;
                len = 0;
            }
        }
        maxlen = Math.max(maxlen , len);
        return maxlen;
    }
    public int longestMonotonicSubarray(int[] nums) {
        return Math.max(findLen(nums,'i') , findLen(nums,'d'));
    }
}
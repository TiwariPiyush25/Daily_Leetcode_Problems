class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;

        int minlen=Integer.MAX_VALUE;
        int i=0,j=0;
        int sum=0;
        while (j<n){
            sum+=arr[j];
            while (sum>=target){
                minlen=Math.min(minlen,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }

        if (minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}
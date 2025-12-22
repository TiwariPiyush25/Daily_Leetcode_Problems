class Solution {
    public int binarySearch(int[] arr,int st,int end,int target){
        while (st<end){
            int mid = st+ (end-st)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] >  target) end = mid;
            else st = mid+1;
        }

        return st;
    }
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        int max = 0;
        for (int i=0;i<n;i++){
            // find the index of height of arr[i]
            int index = binarySearch(dp,0,max,arr[i]);

            dp[index] = arr[i];

            if (index == max){
                max++;
            }
        }

        return max;
    }
}
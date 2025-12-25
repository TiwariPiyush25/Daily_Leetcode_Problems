class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length; int m = queries.length;
        int[] ans = new int[m];

        for (int i = 1;i<n;i++){
            arr[i] = arr[i] ^ arr[i-1];
        }

        for (int i = 0;i<m;i++){
            int left = queries[i][0], right = queries[i][1];
            if (left>0) ans[i] = arr[left-1] ^ arr[right];
            else ans[i] = arr[right];
        }

        return ans;
    }
}
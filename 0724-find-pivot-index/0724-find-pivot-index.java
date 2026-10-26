class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int lsum = 0; if (i > 0) lsum = arr[i - 1];
            int rsum = arr[n - 1] - arr[i];

            if (lsum == rsum) return i;
        }
        return -1;
    }
}
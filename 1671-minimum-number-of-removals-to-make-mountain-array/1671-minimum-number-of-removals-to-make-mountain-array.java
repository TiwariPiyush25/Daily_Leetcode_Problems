class Solution {
    public int minimumMountainRemovals(int[] arr) {
        int n = arr.length;

        int[] dp1 = new int[n]; // left to right LIS
        int[] dp2 = new int[n]; // right to left LIS

        int maxlength = 0; // length of mountain array

        // Calculate left to right LIS
        for (int i=0;i<n;i++){
            for (int j=0;j<=i-1;j++){
                if (arr[j] < arr[i]){
                    dp1[i] = Math.max(dp1[i],dp1[j]);
                }
            }
            dp1[i] += 1;
        }

        // Calculate right to left LIS
        for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>i;j--){
                if (arr[j] < arr[i]){
                    dp2[i] = Math.max(dp2[i],dp2[j]);
                }
            }
            dp2[i] += 1;
        }

        for (int i = 0;i<n;i++){
            if (dp1[i]>1 && dp2[i]>1) {
                int len = dp1[i] + dp2[i] - 1;
                maxlength = Math.max(maxlength, len);
            }
        }

        if (maxlength < 3) return 0;
        return n - maxlength;
    }
}
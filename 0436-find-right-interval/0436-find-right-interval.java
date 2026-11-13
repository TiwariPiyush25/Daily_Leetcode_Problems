class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;

        int[][] copy = new int[n][3];
        for(int i = 0;i < n;i++) {
            copy[i][0] = intervals[i][0];
            copy[i][1] = intervals[i][1];
            copy[i][2] = i;
        }

        Arrays.sort(copy , (a,b) -> a[0] - b[0]);

        int[] ans = new int[n];
        for(int i = 0;i < n;i++) {
            int idx = -1;

            int st = 0, end = n - 1;
            while(st <= end) {
                int mid = (st + end) / 2;

                if(copy[mid][0] >= intervals[i][1]) {
                    idx = copy[mid][2];
                    end = mid - 1; 
                }  
                else st = mid + 1;
            }
            ans[i] = idx;
        }

        return ans;
    }
}
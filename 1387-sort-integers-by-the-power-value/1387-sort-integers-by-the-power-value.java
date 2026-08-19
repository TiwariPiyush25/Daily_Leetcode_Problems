class Solution {
    public int[] dp;
    public int getPower(int x){
        if(x == 1) return 0;

        if(dp[x] != 0) return dp[x];

        int even = 0, odd = 0;
        if(x % 2 == 0){
            even = 1 + getPower(x/2);
        }
        if(x % 2 != 0){
            odd = 1 + getPower((3 * x) + 1);
        }

        return dp[x] = even + odd;
    }
    public int getKth(int lo, int hi, int k) {
        dp = new int[1000000];

        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> (a[1] == b[1]) ? b[0] - a[0] : b[1] - a[1]);
        for(int i = lo;i <= hi;i++){
            int pow = getPower(i);
            maxheap.add(new int[]{i,pow});

            if(maxheap.size() > k) maxheap.remove();
        }

        return maxheap.peek()[0];
    }
}
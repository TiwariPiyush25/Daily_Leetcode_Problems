class Solution {
    public int max(int[] arr){
        int max = Integer.MAX_VALUE;
        for(int ele : arr) max = Math.max(max , ele);
        return max;
    }
    public boolean isPossible(long c,int[] arr,long k){
        long count = 0;

        for(int ele : arr){
            count += ele / c;
        }

        return count >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int st = 1;
        int end = max(candies);

        int ans = 0;
        while(st <= end){
            int mid = st + (end - st) / 2;

            if(isPossible(mid,candies,k)){
                ans = mid;
                st = mid + 1;
            }
            else end = mid - 1;
        }

        return ans;
    }
}
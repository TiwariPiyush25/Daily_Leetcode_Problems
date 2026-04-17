class Solution {
    public long[] sumOfThree(long n) {
        if(n == 0) return new long[]{-1,0,1};

        long st = 0;
        long end = n;

        while(st <= end){
            long mid = st + ((end - st)/2); 

            long totalSum = (mid * (mid + 1))/ 2;
            long sum = ((mid - 3) * (mid - 2)) / 2;
            if((totalSum - sum) == n){
                long[] ans = new long[3];
                ans[2] = mid;
                ans[1] = mid - 1;
                ans[0] = mid - 2;
                
                return ans;
            }
            else if((totalSum - sum) < n) {
                st = mid + 1;
            }
            else end = mid - 1;
        }

        return new long[0];
    }
}
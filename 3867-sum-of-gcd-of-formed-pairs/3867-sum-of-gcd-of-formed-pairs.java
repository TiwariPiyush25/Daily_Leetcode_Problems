class Solution {
    public long gcd(long x,long y){
        if(y%x==0) return x;

        return gcd(y%x,x);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        mx[0] = nums[0];
        for(int i=1;i<n;i++){
            mx[i] = Math.max(nums[i],mx[i-1]);
        }

        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = gcd((long)nums[i],(long)mx[i]);
        }

        Arrays.sort(arr);
        int i = 0, j = n-1;
        long sum = 0;
        while(i < j){
            sum += gcd(arr[i],arr[j]);
            i++;
            j--;
        }

        return sum;
    }
}
class Solution {
    public long Possible(long Time,int[] arr){
        long count = 0;

        for(int ele : arr){
            count += (Time / ele);
        }
        System.out.println(count +" "+Time);
        return count;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long st = 0;
        long end = (long) 1e14;

        long ans = 0;
        while(st <= end){
            long mid = st + (end - st)/2;

            if(Possible(mid,time) >= totalTrips){
                ans = mid;
                end = mid - 1;
            }
            else st = mid + 1;
        }

        return ans;
    }
}
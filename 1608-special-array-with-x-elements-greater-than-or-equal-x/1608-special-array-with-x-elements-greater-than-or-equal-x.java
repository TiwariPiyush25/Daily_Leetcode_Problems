class Solution {
    public int max(int[] A){
        int max= 0;
        for(int ele:A) max = Math.max(max,ele);

        return max;
    }
    public int count(int[] arr,int x){
        int cnt = 0;

        for(int ele:arr){
            if(ele >= x) cnt++;
        }
        return cnt;
    }
    public int specialArray(int[] nums) {
        int st = 0;
        int end = max(nums);

        while(st <= end){
            int mid = (st + end) / 2;

            int cnt = count(nums,mid);
            if(cnt == mid){
                return mid;
            }
            else if(cnt > mid){
                st = mid + 1;
            }
            else end = mid - 1;
        }

        return -1;
    }
}
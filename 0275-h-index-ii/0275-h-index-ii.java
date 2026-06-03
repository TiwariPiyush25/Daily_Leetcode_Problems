class Solution {
    public boolean isPossible(int h,int[] citations){
        int count = 0;
        for(int i = 0;i < citations.length;i++){
            if(h <= citations[i]){
                count++;
            }
        }

        return count >= h;
    }
    public int hIndex(int[] citations) {
        int st = 0;
        int end = citations[citations.length - 1];

        int ans = -1;
        while(st <= end){
            int mid = (st + end) / 2;

            if(isPossible(mid , citations)){
                ans = mid;
                st = mid + 1;
            }
            else end = mid - 1;
        }

        return ans;
    }
}
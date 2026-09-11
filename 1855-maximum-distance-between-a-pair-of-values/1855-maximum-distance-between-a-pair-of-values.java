class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int diff = 0;
        for(int i = 0;i < nums1.length;i++){
            if(i >= nums2.length) break;
            if(nums1[i] > nums2[i]) continue;
            int st = i, end = nums2.length - 1;

            int idx = i;
            while(st <= end){
                int mid = st + ((end - st) / 2);
                
                if(nums2[mid] >= nums1[i]){
                    idx = mid;
                    st = mid + 1;
                }
                else end = mid - 1;
            }

            diff = Math.max(diff , idx - i);
        }

        return diff;
    }
}
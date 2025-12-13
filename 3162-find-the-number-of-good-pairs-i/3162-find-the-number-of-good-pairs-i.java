class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int ele1:nums1){
            for(int ele2:nums2){
                if(ele1%(ele2*k)==0) count++;
            }
        }

        return count;
    }
}
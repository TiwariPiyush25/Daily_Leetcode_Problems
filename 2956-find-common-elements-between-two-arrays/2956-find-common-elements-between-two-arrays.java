class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr = {0,0};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int ele:nums1) set1.add(ele);
        int count = 0;
        for(int ele:nums2) {
            if(set1.contains(ele)) count++;
            set2.add(ele);
        }
        arr[1] = count;
        count = 0;
        for(int ele:nums1){
            if(set2.contains(ele)) count++;
        }
        arr[0] = count;

        return arr;
    }
}
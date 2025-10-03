class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        for(int ele:nums1) arr1.add(ele);

        for(int i=0;i<nums2.length;i++){
            if(arr1.contains(nums2[i])){
                arr2.add(nums2[i]);
                int idx=arr1.indexOf(nums2[i]);
                arr1.remove(idx);
            }
        }

        int[] ans=new int[arr2.size()];
        int i=0;
        for(int ele:arr2){
            ans[i++]=ele;
        }

        return ans;
    }
}
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int ele:nums1){
            set1.add(ele);
        }

        for(int ele:nums2){
            set2.add(ele);
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> lst1=new ArrayList<>();

        for(int ele:set1){
            if(!set2.contains(ele)) lst1.add(ele);
        }
        ans.add(lst1);

        List<Integer> lst2=new ArrayList<>();
        for(int ele:set2){
            if(!set1.contains(ele)) lst2.add(ele);
        }
        ans.add(lst2);

        return ans;
    }
}
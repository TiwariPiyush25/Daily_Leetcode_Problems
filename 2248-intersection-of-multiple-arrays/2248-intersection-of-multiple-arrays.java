class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int ele:nums[0]){
            set1.add(ele);
        }
        
        for(int i=1;i<nums.length;i++){
            HashSet<Integer> set2 = new HashSet<>();
            for(int ele:nums[i]){
                if(set1.contains(ele)) set2.add(ele);
            }

            set1 = set2;
        }

        List<Integer> ans = new ArrayList<>();
        for(int ele:set1){
            ans.add(ele);
        }

        Collections.sort(ans);
        return ans;
    }
}
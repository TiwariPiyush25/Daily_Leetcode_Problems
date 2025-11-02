class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }

        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }

        return ans;
    }
}
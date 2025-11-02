class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0] ,max=nums[nums.length-1];
        List<Integer> ans=new ArrayList<>();
        int idx=0;
        for(int i=min;i<=max;i++){
            if(nums[idx]!=i){
                ans.add(i);
            }
            else idx++;
        }

        return ans;
    }
}
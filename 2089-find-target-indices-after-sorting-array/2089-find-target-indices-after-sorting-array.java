class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;

        int smallercount=0; // smaller numbers less than target
        for(int i=0;i<n;i++){
            if(nums[i]<target) smallercount++;
        }

        int targetcount=0; // current occurance of target
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int idx=smallercount+targetcount;

                ans.add(idx);
                targetcount++; // target 
            }
        }

        return ans;
    }
}

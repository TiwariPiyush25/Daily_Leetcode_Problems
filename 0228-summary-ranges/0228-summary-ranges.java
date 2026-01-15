class Solution {
    public List<String> summaryRanges(int[] nums) {
        int st = 0;
        int end = 1;
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        
        while(end<nums.length){
            if(nums[end] - nums[end-1] == 1){
                end++;
            }
            else{
                if(nums[st] == nums[end-1]){
                    ans.add(""+nums[st]);
                }
                else{
                    ans.add(nums[st]+"->"+nums[end-1]);
                }

                st = end;
                end++;
            }
        }

        if(nums[st] == nums[end-1]){
            ans.add(""+nums[st]);
        }
        else{
            ans.add(nums[st]+"->"+nums[end-1]);
        }

        return ans;
    }
}
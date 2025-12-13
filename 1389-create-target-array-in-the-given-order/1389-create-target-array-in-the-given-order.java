class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }

        int[] ans = new int[nums.length];
        int  i = 0;
        for(int ele:arr) ans[i++] = ele;
        
        return ans;
    }
}
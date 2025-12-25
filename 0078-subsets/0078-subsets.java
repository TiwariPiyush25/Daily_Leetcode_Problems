class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        int total = 1 << n;

        for (int num=0;num<total;num++){
            List<Integer> res = new ArrayList<>();
            for (int bitidx=0;bitidx<n;bitidx++){
                int mask = 1 << bitidx;

                if ((num & mask) !=0) res.add(nums[bitidx]);
            }

            ans.add(res);
        }

        return ans;
    }
}
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = 1 << nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 0;j<nums.length;j++){
                int mask = 1 << j;

                if((i & mask)!=0) temp.add(nums[j]);
            }
            ans.add(temp);
        }

        int sum = 0;
        for(List<Integer> temp:ans){
            int xor = 0;
            for(int ele:temp) xor ^= ele;

            sum+=xor;
        }

        return sum;
    }
}
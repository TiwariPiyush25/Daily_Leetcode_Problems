class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        for(int i = nums.length - 1;i >= 0;i--){
            int val = nums[i];

            while(val > 0){
                int ld = val % 10;
                temp.add(0,ld);
                val /= 10;
            }
        }

        int n = temp.size();
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            ans[i] = temp.get(i);
        }

        return ans;
    }
}
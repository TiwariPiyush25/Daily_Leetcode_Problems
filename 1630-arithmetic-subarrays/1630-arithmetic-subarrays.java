class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int m = l.length;
        for(int i = 0;i < m;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = l[i];j <= r[i];j++){
                temp.add(nums[j]);
            }

            Collections.sort(temp);
            int sum = temp.get(1) - temp.get(0);

            for(int j = 2;j < temp.size();j++){
                if(temp.get(j) - temp.get(j-1) != sum){
                    ans.add(false);
                    break;
                }
            }

            if(ans.size() == i) ans.add(true);
        }

        return ans;
    }
}
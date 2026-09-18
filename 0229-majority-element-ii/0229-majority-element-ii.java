class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnd1 = Integer.MIN_VALUE;
        int cnd2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == cnd1){
                cnt1++;
            }
            else if(nums[i] == cnd2){
                cnt2++;
            }
            else if(cnt1 == 0){
                cnd1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                cnd2 = nums[i];
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        int f1 = 0; int f2 = 0;
        for(int ele : nums){
            if(ele == cnd1) f1++;
            else if(ele == cnd2) f2++;
        }

        List<Integer> ans = new ArrayList<>();
        if(f1 > nums.length/3) ans.add(cnd1);
        if(f2 > nums.length/3) ans.add(cnd2);

        return ans;
    }
}
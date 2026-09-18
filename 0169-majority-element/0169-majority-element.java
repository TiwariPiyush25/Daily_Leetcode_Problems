class Solution {
    public int majorityElement(int[] nums) {
        int cnd = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] == cnd){
                cnt++;
            }
            else if(cnt == 0){
                cnd = nums[i];
                cnt = 1;
            }
            else {
                cnt--;
            }
        }

        return cnd;
    }
}
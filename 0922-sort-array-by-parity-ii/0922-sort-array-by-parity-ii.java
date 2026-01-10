class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(i%2==0){
                int j = i;
                while(j<nums.length-1 && nums[j]%2!=0){
                    j++;
                }

                int val = nums[j];
                int k = j-1;
                while(k>=i){
                    nums[k+1] = nums[k];
                    k--;
                }

                nums[i] = val;
            }
            else {
                int j = i;
                while(j<nums.length-1 && nums[j]%2==0){
                    j++;
                }

                int val = nums[j];
                int k = j-1;
                while(k>=i){
                    nums[k+1] = nums[k];
                    k--;
                }

                nums[i] = val;
            }
        }

        return nums;
    }
}
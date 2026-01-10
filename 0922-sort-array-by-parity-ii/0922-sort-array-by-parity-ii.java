class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd  = new ArrayList<>();
        ArrayList<Integer> even  = new ArrayList<>();
        for(int ele:nums){
            if(ele%2==0) even.add(ele);
            else odd.add(ele);
        }

        int j = 0;
        int k = 0;
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = even.get(j);
                j++;
            }
            else {
                nums[i] = odd.get(k);
                k++;
            }
        }

        return nums;
    }
}
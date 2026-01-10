class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int ele:nums){
            if(ele>0) positive.add(ele);
            else negative.add(ele);
        }

        int i=0;
        int j=0;
        int k=0;
        while(k<nums.length){
            nums[k++] = positive.get(i++);
            nums[k++] = negative.get(j++);
        }

        return nums;
    }
}
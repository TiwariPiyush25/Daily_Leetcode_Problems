class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for(int ele : nums) sum += ele;

        int currSum = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i = nums.length - 1;i >=0;i--){
            currSum += nums[i];
            sum -= nums[i];

            arr.add(nums[i]);
            if(currSum > sum) break;
        }

        return arr;
    }
}
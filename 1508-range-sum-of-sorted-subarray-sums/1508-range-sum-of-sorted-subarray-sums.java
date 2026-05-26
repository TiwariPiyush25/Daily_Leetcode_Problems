class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1;i < nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }

        for(int i = 0;i < nums.length;i++){
            arr.add(nums[i]);
            for(int j = i + 1;j < nums.length;j++){
                arr.add(nums[j] - nums[i]);
            }
        }

        Collections.sort(arr);

        long sum = 0;
        int mod = 1000000007;
        for(int i = left - 1;i < right;i++){
            sum = (sum + arr.get(i)) % mod;
        }

        return (int) sum;
    }
}
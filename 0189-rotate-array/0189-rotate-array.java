class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] arr = new int[n];

        for(int i = 0;i + k < n;i++){
            arr[i+k] = nums[i];
        }

        int j = 0;
        for(int i = n-k;i < n;i++){
            arr[j++] = nums[i];
        }

        for(int i = 0;i < n;i++){
            nums[i] = arr[i];
        }
    }
}
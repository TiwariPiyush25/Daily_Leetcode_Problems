class Solution {
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minimumSwaps(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int cnt = 0;
        while(i < j){
            if(nums[i] == 0 && nums[j] != 0){
                swap(nums,i,j);
                i++;
                j--;

                cnt++;
            }

            while(i < j && nums[i] != 0) i++;
            while(j >= i && nums[j] == 0) j--;
        }

        return cnt;
    }
}
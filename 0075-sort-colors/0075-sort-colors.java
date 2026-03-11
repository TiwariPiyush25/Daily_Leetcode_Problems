class Solution {
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, hi = nums.length-1;

        while(mid <= hi){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,hi);
                hi--;
            }
            else mid++;
        }
    }
}
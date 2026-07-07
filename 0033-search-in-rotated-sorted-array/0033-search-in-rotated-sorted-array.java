class Solution {
    public int search(int[] arr, int target) {
        int n  = arr.length;
        int st = 0;
        int end = n-1;

        while(st <= end){
            int mid = (st + end)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > arr[n-1]){
                if(target >= arr[st] && target <= arr[mid]){
                    end = mid - 1;
                }
                else st = mid + 1;
            }
            else {
                if(target >= arr[mid] && target <= arr[n-1]){
                    st = mid + 1;
                }
                else end = mid - 1;
            }
        }

        return -1;
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 1, j = arr.length - 2;

        while(i <= j){
          int mid = (i + j) / 2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if(arr[mid] < arr[mid + 1]) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        return 0;
    }
}
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int[] arr = new int[25];

        int n = hours.length;
        int counter = 0;
        for(int i = n - 1;i >= 0;i--){
            int hr = hours[i] % 24;

            int rem = 24 - hr;
            if(arr[rem] != 0){
                counter += arr[rem];
            }
            else if(hr == 0 && arr[0] != 0){
                counter += arr[0];
            }

            arr[hr]++;
        }

        return counter;
    }
}
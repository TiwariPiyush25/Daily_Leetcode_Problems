class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[61];

        int pairs = 0;
        for(int i = time.length - 1;i >= 0;i--){
            int val = time[i] % 60;

            int rem = 60 - val;

            if(arr[rem] != 0){
                pairs += arr[rem];
            }
            else if(val == 0 && arr[0] != 0){
                pairs += arr[0];
            }
            arr[val]++;
        }

        return pairs;
    }
}
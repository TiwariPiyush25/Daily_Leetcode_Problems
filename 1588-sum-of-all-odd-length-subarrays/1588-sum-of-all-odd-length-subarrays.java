class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = 1;

        int totalSum = 0;
        while(len <= arr.length){
            int i = 0;
            int j = len;
            int sum = 0;

            for(int k = 0;k < len;k++){
                sum += arr[k];
            }
            totalSum += sum;
            
            while(j < arr.length){
                sum -= arr[i++];
                sum += arr[j++];

                totalSum += sum;
            }
            len += 2;
        }

        return totalSum;
    }
}
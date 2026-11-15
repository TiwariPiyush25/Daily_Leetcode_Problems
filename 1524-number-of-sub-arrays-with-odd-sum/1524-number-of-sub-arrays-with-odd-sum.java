class Solution {
    public int numOfSubarrays(int[] arr) {
        for(int i = 1;i < arr.length;i++){
            arr[i] = arr[i] + arr[i - 1];
        }

        int Counter = 0 ,oddCount = 0 , evenCount = 0 , mod = 1000000007;
        for(int ele : arr) { 
            if(ele % 2 != 0) {
                Counter = (Counter + evenCount + 1) % mod;
                oddCount++;
            }
            else {
                Counter = (Counter + oddCount) % mod;
                evenCount++;
            }
        }
        return Counter;
    }
}
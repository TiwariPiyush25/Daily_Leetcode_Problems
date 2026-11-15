class Solution {
    public int numOfSubarrays(int[] arr) {
        int Counter = 0 ,oddCount = 0 , evenCount = 0 , mod = 1000000007;
        if(arr[0] % 2 == 0) evenCount = 1;
        else {
            Counter++;
            oddCount++;
        }
        for(int i = 1;i < arr.length;i++) { 
            arr[i] = arr[i] + arr[i - 1];
            int ele = arr[i];
            
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
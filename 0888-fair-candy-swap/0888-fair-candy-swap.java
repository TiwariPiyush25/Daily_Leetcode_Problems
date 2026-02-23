class Solution {
    public int[] fairCandySwap(int[] arr, int[] brr) {
        int sum1 = 0; int sum2 = 0;

        for(int ele:arr) sum1 += ele;
        for(int ele:brr) sum2 += ele;

        int diff = (sum1 - sum2) / 2;
        Arrays.sort(arr); Arrays.sort(brr);

        int i = 0, j = 0;
        int[] ans = {-1,-1};
        while(i<arr.length && j < brr.length){
            if(arr[i] - brr[j] == diff){
                ans[0] = arr[i];
                ans[1] = brr[j];
                return ans;
            }

            if(arr[i] - brr[j] < diff){
                i++;
            }
            else if(arr[i] - brr[j] > diff){
                j++;
            }
        }

        return ans;
    }
}
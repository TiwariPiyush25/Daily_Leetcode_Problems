class Solution {
    public int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int k = arr.length - 1;k>=0;k--){
            int i = 0;
            int j = k-1;
            while(i<j){
                if(arr[i] + arr[j] > arr[k]){
                    count += (j - i);
                    j--;
                }
                else i++;
            }
        }

        return count;
    }
}
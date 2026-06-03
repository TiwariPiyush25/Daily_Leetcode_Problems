class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] arr = new int[m*n];

        for(int[] ind : indices){
            int r = ind[0], c = ind[1];

            int st = r * n;
            int end = (r * n) + n;
            for(int i = st;i < end;i++){
                arr[i]++;
            }

            for(int j = c;j < arr.length;j += n){
                arr[j]++;
            }
        }

        int cnt = 0;
        for(int ele : arr){
            if(ele % 2 != 0) cnt++;
        }

        return cnt;
    }
}
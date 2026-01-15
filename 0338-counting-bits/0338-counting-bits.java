class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i=0;i<n+1;i++){
            int k = 0;
            int num = i;
            int cnt = 0;
            for (int j=0;j<=31;j++){
                int mask = 1 << j;

                if ((num & mask) !=0) cnt++;
            }

            arr[i] = cnt;
        }

        return arr;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]); // custom sort

        int result = 0;
        for (int[] arr:boxTypes){
            int n = arr[0];
            int u = arr[1];

            int min = Math.min(truckSize,n);
            truckSize -= min;

            result += min * u;
            if (truckSize==0){
                return result;
            }
        }

        return result;
    }
}
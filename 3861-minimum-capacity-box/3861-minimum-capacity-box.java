class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE, minidx = 0;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<min){
                min = capacity[i];
                minidx = i;
            }
        }

        if(min != Integer.MAX_VALUE) return minidx;
        return -1;
    }
}
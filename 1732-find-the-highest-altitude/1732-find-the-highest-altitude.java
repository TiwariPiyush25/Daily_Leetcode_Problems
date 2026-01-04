class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int a = 0;
        max = a;
        for(int i=0;i<gain.length;i++){
            a += gain[i];
            max = Math.max(max,a);
        }

        return max;
    }
}
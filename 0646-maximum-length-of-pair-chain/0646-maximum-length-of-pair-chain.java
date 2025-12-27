class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) -> Integer.compare(a[1],b[1]));

        int preve = Integer.MIN_VALUE;
        int count = 0;
        for (int[] pair : pairs){
            if (preve < pair[0]){
                preve = pair[1];
                count++;
            }
        }
        return count;
    }
}
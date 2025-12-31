class Solution {
    public int maxCoins(int[] piles) {
       Arrays.sort(piles);

       int i = 0;
       int j = piles.length-1;
       int total = 0;
       while(i<j){
        j-=2;
        i++;

        total += piles[j+1];
       }

       return total;
    }
}
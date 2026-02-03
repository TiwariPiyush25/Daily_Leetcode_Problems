class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        for(int i=0;i<len;i++){
            boolean isleftEmpty = (i == 0 || flowerbed[i-1] == 0);
            boolean isrightEmpty = (i == len-1 || flowerbed[i+1] == 0);

            if(flowerbed[i] == 0 && isleftEmpty && isrightEmpty){
                flowerbed[i] = 1;
                count++;
            }
        }

        return count >= n;
    }
}
class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int x = capacityA;
        int y = capacityB;

        int i = 0, j = plants.length-1;
        int refill = 0;
        while(i < j){
            if(plants[i] <= x){
                x -= plants[i];
            }
            else {
                x = capacityA;
                refill++;
                x -= plants[i];
            }

            if(plants[j] <= y){
                y -= plants[j];
            }
            else {
                y = capacityB;
                refill++;
                y -= plants[j];
            }

            i++; j--;
        }

        if(i == j && Math.max(x,y) < plants[i]) refill++;
        return refill;
    }
}
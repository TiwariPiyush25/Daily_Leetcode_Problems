class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalBottles = 0;
        int emptyBottles = 0;

        while(numBottles > 0 || emptyBottles >= numExchange){
            while(emptyBottles >= numExchange) {
                numBottles += 1;
                emptyBottles -= numExchange++;
            }

            totalBottles += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;
        }

        return totalBottles;
    }
}